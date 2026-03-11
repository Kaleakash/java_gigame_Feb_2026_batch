package com.company.app.service;

import com.company.app.bean.Employee;
import com.company.app.repository.EmployeeRepository;
import com.company.app.repository.impl.EmployeeRepositoryImpl;

public abstract class AbstractEmployeeService implements EmployeeService {

    protected EmployeeRepository repository;

    public AbstractEmployeeService() {
        this.repository = new EmployeeRepositoryImpl();
    }

    // own method 
    protected boolean isValidEmployee(Employee employee) {
        return employee != null &&
               employee.getId() > 0 &&
               employee.getSalary() > 0;
    }

    // provided body for interface method (optioa
    public Employee findEmployee(int id) {
        return repository.getEmployeeById(id);
    }
}
