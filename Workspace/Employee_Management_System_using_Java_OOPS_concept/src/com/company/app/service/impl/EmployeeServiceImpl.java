package com.company.app.service.impl;

import com.company.app.bean.Employee;
import com.company.app.service.AbstractEmployeeService;

public class EmployeeServiceImpl extends AbstractEmployeeService {

    @Override
    public void createEmployee(Employee employee) {
        if (isValidEmployee(employee)) {
            repository.addEmployee(employee);
            System.out.println("Employee added successfully");
        } else {
            System.out.println("Invalid employee data");
        }
    }

    @Override
    public void displayAllEmployees() {
        Employee[] employees = repository.getAllEmployees();
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(
                        emp.getId() + " " +
                        emp.getName() + " " +
                        emp.getSalary()
                );
            }
        }
    }

    @Override
    public void displayEmployeeById(int id) {
        Employee emp = findEmployee(id);
        if (emp != null) {
            System.out.println(
                    emp.getId() + " " +
                    emp.getName() + " " +
                    emp.getSalary()
            );
        } else {
            System.out.println("Employee not found");
        }
    }

    @Override
    public void updateSalary(int id, double salary) {
        Employee emp = findEmployee(id);
        if (emp != null) {
            emp.setSalary(salary);
            System.out.println("Salary updated");
        } else {
            System.out.println("Employee not found");
        }
    }

    @Override
    public void deleteEmployee(int id) {
        Employee[] employees = repository.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null &&
                employees[i].getId() == id) {
                employees[i] = null;
                System.out.println("Employee deleted");
                return;
            }
        }
        System.out.println("Employee not found");
    }
}
