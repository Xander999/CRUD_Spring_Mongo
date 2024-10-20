package com.xanderProjects.crudMongo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xanderProjects.crudMongo.dto.EmployeeTO;
import com.xanderProjects.crudMongo.model.Employee;
import com.xanderProjects.crudMongo.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String createEmployee(EmployeeTO employeeTO){
        try {
            Employee emp = Employee.builder()
                           .empName(employeeTO.getEmpName())
                           .salary(employeeTO.getSalary())
                           .location(employeeTO.getLocation())
                           .build();
            employeeRepository.save(emp);

        } catch (Exception e) {
            // TODO: handle exception
        }

        return "Employee Created Successfully";
    }

    public List<Employee> getEmployee(){
        List<Employee> empList = new ArrayList<>();
        try {
            empList = employeeRepository.findAll();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return empList;    
    }

    public String deleteEmployee(String id){
        try {
            employeeRepository.deleteById(id);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return "Employee delete Successfully";    
    }

    public String updateEmployee(EmployeeTO employeeTO) {
        try {
            Employee emp = Employee.builder()
                           .id(employeeTO.getId())
                           .empName(employeeTO.getEmpName())
                           .location(employeeTO.getLocation())
                           .salary(employeeTO.getSalary())
                           .build();
            employeeRepository.save(emp);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return " Employee Updated Successfully";
    }
}
