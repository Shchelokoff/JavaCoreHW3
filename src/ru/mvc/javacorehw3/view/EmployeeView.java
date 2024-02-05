package ru.mvc.javacorehw3.view;

import ru.mvc.javacorehw3.model.Employee;

public class EmployeeView {
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Employee{" +
                "name='" + employee.getName() + '\'' +
                ", salary=" + employee.getSalary() +
                ", age=" + employee.getAge() +
                '}');
    }
}
