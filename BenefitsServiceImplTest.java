package com.example.group6_hrms.service;

import com.example.group6_hrms.model.Benefits;
import com.example.group6_hrms.model.Employee;
import com.example.group6_hrms.repository.BenefitsRepository;
import com.example.group6_hrms.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class BenefitsServiceImplTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private BenefitsRepository benefitsRepository;

    @Test
    void getAllBenefits() {
        List<Benefits> benefits = benefitsRepository.findAll();
        assertEquals(3, benefits.size());
    }

    @Test
    void testFindOne(){
        Employee employee = employeeRepository.findById(2L).get();
        assertEquals(111112, employee.getBenefitPackageId());
    }
}