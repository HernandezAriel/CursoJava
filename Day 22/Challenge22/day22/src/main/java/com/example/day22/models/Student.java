package com.example.day22.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint (columnNames = {"phone"})
})

public class Student {
    
    @Id
    private int dni;

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private String phone;
}
