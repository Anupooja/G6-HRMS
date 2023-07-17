package com.example.group6_hrms.service;

import com.example.group6_hrms.model.Training;
import com.example.group6_hrms.repository.EmployeeRepository;
import com.example.group6_hrms.repository.TrainingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TrainingServiceImplTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private TrainingRepository trainingRepository;

    @Test
    void getAllTraining() {
        List<Training> trainings = trainingRepository.findAll();
        assertEquals(3, trainings.size());
    }

}