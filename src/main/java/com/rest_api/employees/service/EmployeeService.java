package com.rest_api.employees.service;

import com.rest_api.employees.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee getEmployee(int id);
    void saveEmployee(Employee employee);
    void deleteEmployee(int id);

}
