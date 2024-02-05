package ru.mvc.javacorehw3.controller;

import ru.mvc.javacorehw3.model.Employee;
import ru.mvc.javacorehw3.model.Manager;
import ru.mvc.javacorehw3.view.EmployeeView;
import java.util.List;

public class EmployeeController {
    private List<Employee> employees;
    private EmployeeView employeeView;

    public EmployeeController(List<Employee> employees, EmployeeView employeeView) {
        this.employees = employees;
        this.employeeView = employeeView;
    }

    /**
     * Статический метод для повышения зарплаты сотрудников, кроме руководителей.
     */
    public static void increaseSalary(Employee[] employees, double amount) {
        for (Employee employee : employees
        ) {
            if (!(employee instanceof Manager)) {
                employee.increaseSalary(amount);
            }
        }
    }

    public void printEmployeeDetails() {
        for (Employee employee : employees) {
            employeeView.printEmployeeDetails(employee);
        }
    }
}