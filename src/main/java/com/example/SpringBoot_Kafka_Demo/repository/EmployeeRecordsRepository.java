package com.example.SpringBoot_Kafka_Demo.repository;

import com.example.SpringBoot_Kafka_Demo.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRecordsRepository extends MongoRepository<Employee,Integer> {

}
