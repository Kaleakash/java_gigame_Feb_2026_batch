package com.company.app.repository;

import com.company.app.bean.Employee;

public interface EmployeeRepository {

    void addEmployee(Employee employee);

    Employee[] getAllEmployees();

    Employee getEmployeeById(int id);
}
