package service;

import entity.Employee;

import java.text.Normalizer;

public class Report {
    public static void generateReport (Employee[] employees) {
        System.out.println("Отчет о зарплате сотрудников:\n");
        for (Employee employee : employees) {
            System.out.printf("%-20s %15s%n", employee.fullname, employee.salary);
        }
    }
}
