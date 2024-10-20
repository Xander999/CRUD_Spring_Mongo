package com.xanderProjects.crudMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.xanderProjects.crudMongo.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
