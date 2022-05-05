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
public class Inscription {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String keySubject;
    private int studentDni;
}
