package com.xanderProjects.crudMongo.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeTO {

    private String id;
    private String empName;
    private String location;
    private BigDecimal salary;
}
