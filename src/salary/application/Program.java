package salary.application;

import salary.entities.Employee;

import java.util.Scanner;


public class Program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Employee's name: ");
        employee.name = sc.nextLine();
        System.out.print("Employee's salary without taxes: ");
        employee.salaryWithoutTaxes = sc.nextDouble();
        System.out.print("Employee's tax: ");
        employee.tax = sc.nextDouble();
        System.out.println("Data: " + employee);
        System.out.println("Employee's raise in '%': ");
        double raise = sc.nextDouble();
        employee.increaseSalary(raise);
        System.out.println("Employee's salary after raise " + employee);
        sc.close();


    }
}
