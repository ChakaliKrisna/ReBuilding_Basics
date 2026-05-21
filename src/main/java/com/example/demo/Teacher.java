package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Teacher {
    ArrayList<String> subjects;

    public Teacher(){
        System.out.println("teacher is initializing....");
    }
    @PostConstruct
    public void init(){
       subjects = new ArrayList<String>();
        System.out.println("post construct called though post construct");
       subjects.add("math");
       subjects.add("social");
    }
    public void teach(){
        System.out.println("teacher is teaching.....");

        for(String subject:subjects){
            System.out.println(subject);
        }
    }
}
