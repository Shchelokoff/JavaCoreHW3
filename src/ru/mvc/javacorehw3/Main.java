package ru.mvc.javacorehw3;

import ru.mvc.javacorehw3.controller.EmployeeController;
import ru.mvc.javacorehw3.model.Employee;
import ru.mvc.javacorehw3.model.Manager;
import ru.mvc.javacorehw3.model.SalaryComparator;
import ru.mvc.javacorehw3.view.EmployeeView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Главный класс программы
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Max", 100, 25));
        employees.add(new Employee("Lena", 200, 25));
        employees.add(new Employee("Vova", 300, 25));
        employees.add(new Employee("Hariton", 500, 25));
        employees.add(new Manager("Durov", 10000, 50));

        EmployeeView employeeView = new EmployeeView();
        EmployeeController controller = new EmployeeController(employees, employeeView);

        System.out.println("Список сотрудников до повышения заработной платы:");
        controller.printEmployeeDetails();

        controller.increaseSalary(employees.toArray(new Employee[0]), 10000);
        System.out.println("\nСписок сотрудников после повышения заработной платы:");
        controller.printEmployeeDetails();

        Collections.sort(employees, new SalaryComparator());
        System.out.println("\nСписок сотрудников после сортировки по заработной плате:");
        controller.printEmployeeDetails();
    }
}