package com.spring_intro.greeting.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private int id;
    private String employeeName;

    @Autowired
    private Department department;

    //Getter Method
    public String getEmployeeName() {
        return employeeName;
    }

    //Getter method
    public int getId(){
        return id;
    }

    //Setter Method
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    //Setter Method
    public void setId(int id) {
        this.id = id;
    }

    //Getter
    public String getDepartmentName(){
        return department.getDepartmentName();
    }
}
