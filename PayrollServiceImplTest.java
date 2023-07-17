package com.example.group6_hrms.service;

import com.example.group6_hrms.model.Payroll;
import com.example.group6_hrms.repository.EmployeeRepository;
import com.example.group6_hrms.repository.PayrollRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class PayrollServiceImplTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private PayrollRepository payrollRepository;

    @Test
    void getAllPayrolls() {
        List<Payroll> payrolls = payrollRepository.findAll();
        assertEquals(3, payrolls.size());
    }

}