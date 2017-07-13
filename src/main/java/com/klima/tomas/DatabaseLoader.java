package com.klima.tomas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
        this.repository.save(new Employee("emp2", "Surname2", "ring hearer"));
        this.repository.save(new Employee("emp3", "Surname3", "ring fearer"));
        this.repository.save(new Employee("emp4", "Surname4", "ring searer"));
    }
}