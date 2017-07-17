package com.klima.tomas;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class Employee {

    private @Id
    @GeneratedValue
    Long id;
    private String firstName;
    private String surname;
    private String description;

    private Employee() {}

    public Employee(String firstName, String surname, String description) {
        this.firstName = firstName;
        this.surname = surname;
        this.description = description;
    }
}