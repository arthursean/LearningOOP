package exercices2.salary.application;

import exercices2.salary.entities.Employee;
import exercices2.salary.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = sc.nextInt();
        for(int i = 1; i <= numberOfEmployees; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char verification =  Character.toLowerCase(sc.next().charAt(0));
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double salaryPerHour = sc.nextDouble();
            if(verification == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, salaryPerHour, hours, additionalCharge));
                continue;
            }
            employees.add(new Employee(name, salaryPerHour, hours));
        }
        sc.close();
        System.out.println("PAYMENTS:");
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}
