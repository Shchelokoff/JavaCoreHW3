package ru.mvc.javacorehw3.model;
import java.util.Comparator;

/**
 * Компаратор сравнения зарплат сотрудников
 */
public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        double salary1 = emp1.getSalary();
        double salary2 = emp2.getSalary();
        if (salary1 < salary2) {
            return -1;
        } else if (salary1 > salary2) {
            return 1;
        } else {
            return 0;
        }
    }
}