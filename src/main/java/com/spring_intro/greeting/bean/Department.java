package com.spring_intro.greeting.bean;

import org.springframework.stereotype.Component;

@Component
public class Department {
    public String getDepartmentName(){
        return "Software Department";
    }
}
