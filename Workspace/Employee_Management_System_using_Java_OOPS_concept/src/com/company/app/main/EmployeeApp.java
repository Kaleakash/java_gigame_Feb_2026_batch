package com.company.app.main;

import java.util.Scanner;
import com.company.app.bean.Employee;
import com.company.app.service.EmployeeService;
import com.company.app.service.impl.EmployeeServiceImpl;

public class EmployeeApp {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n1 Add Employee");
            System.out.println("2 View All Employees");
            System.out.println("3 View Employee By ID");
            System.out.println("4 Update Salary");
            System.out.println("5 Delete Employee");
            System.out.println("6 Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();

                    System.out.print("Enter Name: ");
                    String name = scanner.next();

                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();

                    service.createEmployee(
                            new Employee(id, name, salary)
                    );
                    break;

                case 2:
                    service.displayAllEmployees();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    service.displayEmployeeById(scanner.nextInt());
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int eid = scanner.nextInt();

                    System.out.print("New Salary: ");
                    double sal = scanner.nextDouble();

                    service.updateSalary(eid, sal);
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    service.deleteEmployee(scanner.nextInt());
                    break;

                case 6:
                    System.out.println("Application closed");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
