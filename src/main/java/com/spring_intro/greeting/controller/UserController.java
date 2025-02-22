package com.spring_intro.greeting.controller;

import com.spring_intro.greeting.bean.Employee;
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
}
