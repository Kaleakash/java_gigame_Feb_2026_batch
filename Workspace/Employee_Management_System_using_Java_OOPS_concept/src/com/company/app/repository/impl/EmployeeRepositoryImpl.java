package com.company.app.repository.impl;

import com.company.app.bean.Employee;
import com.company.app.repository.EmployeeRepository;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static Employee[] database = new Employee[10];
    private static int index = 0;

    @Override
    public void addEmployee(Employee employee) {
        if (index < database.length) {
            database[index++] = employee;
        } else {
            System.out.println("In memory Database full");
        }
    }

    @Override
    public Employee[] getAllEmployees() {
        return database;
    }

    @Override
    public Employee getEmployeeById(int id) {
        for (Employee emp : database) {
            if (emp != null && emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }
}
