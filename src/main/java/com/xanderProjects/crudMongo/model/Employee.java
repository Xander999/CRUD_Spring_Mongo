package com.xanderProjects.crudMongo.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Builder;
import lombok.Data;

@Document(value = "employee")
@Data       // (lombok) to generate setters and getters and Rest template
@Builder    // (lombok) 
public class Employee {

    @Id
    private String id;
    @Field(name = "employee_name")
    private String empName;
    private String location;
    private BigDecimal salary;

}
