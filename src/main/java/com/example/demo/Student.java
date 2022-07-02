package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Student {
    @Id
    @SequenceGenerator(
        sequenceName = "student_sequence",
        name = "student_sequence",
        allocationSize = 1
        
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"
    )
    @Column(
        name = "id",
        updatable = false
    )
    private Long id;
    @Column(
        name = "first_name",
        nullable = false,
        columnDefinition = "TEXT"
    )
    private String first_name;
    @Column(
        name = "last_name",
        nullable = false,
        columnDefinition = "TEXT"
    )
    private String last_name;
    @Column(
        name = "email",
        nullable = false,
        columnDefinition = "TEXT"
    )
    private String email;
    @Column(
        name = "age",
        nullable = false
        )
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
    public String getFirst_name(){
        return this.first_name;
    }
    public String getLast_name(){
        return this.last_name;
    }
    public String getEmail(){
        return this.email;
    }
    public int getAge(){
        return this.age;
    }

    public Student(Long id, String first_name, String last_name, String email, int age) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.age = age;
    }
    
}
