package com.spring_intro.greeting.controller;

import com.spring_intro.greeting.bean.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This annotation marks the class as a REST controller, meaning it will handle HTTP requests
@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/hello")
    public String sayHello() {
        // Returns a simple greeting message as the HTTP response
        return "Hello From BridgeLabz";

    }

    @Autowired
    private Employee employee;

    //Method to GET /api/employee
    @GetMapping("/employee")
    public String getEmployeeDetails(){
        //Setting Employee Details
        employee.setId(101);
        employee.setEmployeeName("Arjun Chouhan");

        //Returning Details
        return "Employee Id : "+employee.getId() +" , "
                +"Employee Name : "+employee.getEmployeeName()+ " , "
                +"Department Name : "+employee.getDepartmentName();
    }

    //creating a logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    //method to log different levels of messages when "/api/log" is accessed
    @GetMapping("/log")
    public String logMessages() {
        logger.info("Information of logMessages() method");
        logger.debug("Debugging log");
        logger.warn("warning");
        logger.error("ERROR");
        //returning a response to indicate logs have been recorded
        return "Logs have been recorded.";
    }
}
