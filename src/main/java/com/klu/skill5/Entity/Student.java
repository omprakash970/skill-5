package com.klu.skill5.Entity;


import org.springframework.stereotype.Component;

@Component
public class Student {
    private int id=32058;
    private String name="Om Prakash";
    public void display()
    {
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
    }

}
