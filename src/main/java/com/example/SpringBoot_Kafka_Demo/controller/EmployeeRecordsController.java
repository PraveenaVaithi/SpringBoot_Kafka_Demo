package com.example.SpringBoot_Kafka_Demo.controller;

import com.example.SpringBoot_Kafka_Demo.entity.Employee;
import com.example.SpringBoot_Kafka_Demo.service.EmployeeRecordsService;
import com.example.SpringBoot_Kafka_Demo.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/api/employee")
public class EmployeeRecordsController {

    @Autowired
    EmployeeRecordsService employeeRecordsService;

    @Autowired
    Producer producer;

    @PostMapping
    public ResponseEntity insertEmployeeRecords(@RequestBody Employee employee) {
        Employee employeeResult=employeeRecordsService.insertEmployeeRecords(employee);
        if(!Objects.isNull(employeeResult))
            producer.sendMsgtoTopic("Employee created Successfully!!!!!!!!!!!!!!!!!!");
        return ResponseEntity.ok().body(employeeRecordsService.insertEmployeeRecords(employee));
    }
}