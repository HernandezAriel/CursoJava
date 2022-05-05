package com.example.day22.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subjets")

public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int dni;
    private String firstName;
    private String lastName;
    private String phone;
}
