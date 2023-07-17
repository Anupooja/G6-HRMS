package com.example.group6_hrms.service;

import com.example.group6_hrms.model.Employee;
import com.example.group6_hrms.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class EmployeeServiceImplTest {

    @Autowired
    private EmployeeRepository repository;


    @Test
    void getAllEmployees() {
        List<Employee> employees = repository.findAll();
        assertEquals(3, employees.size());
    }

    @Test
    void testFindOne() {
        Employee employee = repository.findById(2L).get();
        assertEquals("Bill", employee.getFirstName());
    }

}