package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private Long id;
    private String first_name;
    private String last_name;
    private String email;
    private int age;

    public void setId(Long id){
        this.id = id;
    }
    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }
    public void setLast_name(String last_name){
        this.last_name = last_name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Long getId(){
        return this.id;
    }
}
