package com.example.SpringBoot_Kafka_Demo.service;

import com.example.SpringBoot_Kafka_Demo.entity.Employee;
import com.example.SpringBoot_Kafka_Demo.repository.EmployeeRecordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeRecordsService {

    @Autowired
    EmployeeRecordsRepository employeeRecordsRepository;

    public Employee insertEmployeeRecords(Employee employee){
        return employeeRecordsRepository.save(employee);
    }
}
