package com.example.companydemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    private long id;
    private String name;
    private int age;
    private double salary;
}
