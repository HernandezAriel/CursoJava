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

public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String key;
    private String nameSubjetc;
}
    
