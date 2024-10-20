package com.xanderProjects.crudMongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.xanderProjects.crudMongo.dto.EmployeeTO;
import com.xanderProjects.crudMongo.model.Employee;
import com.xanderProjects.crudMongo.service.EmployeeService;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String createEmployee(@RequestBody EmployeeTO emp){

        return employeeService.createEmployee(emp);

    }

    @GetMapping("/get/employee")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getEmployee(){
        return employeeService.getEmployee();

    }

    @GetMapping("/delete/employee")
    @ResponseStatus(HttpStatus.OK)
    public String deleteEmployee(@RequestParam String id){
        return employeeService.deleteEmployee(id);

    }

    @PutMapping("/update/employee")
    @ResponseStatus(HttpStatus.OK)
    public String updateEmployee(@RequestBody EmployeeTO emp){
        return employeeService.updateEmployee(emp);
    }


}
