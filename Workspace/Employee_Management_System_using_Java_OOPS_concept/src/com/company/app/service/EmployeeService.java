package com.company.app.service;

import com.company.app.bean.Employee;

public interface EmployeeService {

    void createEmployee(Employee employee);

    void displayAllEmployees();

    void displayEmployeeById(int id);

    void updateSalary(int id, double salary);

    void deleteEmployee(int id);
    
    Employee findEmployee(int id);
    
}
