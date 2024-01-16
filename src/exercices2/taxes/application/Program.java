package exercices2.taxes.application;

import exercices2.taxes.entities.Company;
import exercices2.taxes.entities.Individual;
import exercices2.taxes.entities.Person;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Person> listOfPeople = new ArrayList<>();
        System.out.print("Enter number of tax payers: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("Enter tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char choice = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if(choice == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenses = sc.nextDouble();
                listOfPeople.add(new Individual(name, anualIncome, healthExpenses));
                continue;
            }
            System.out.print("Number of employees: ");
            Integer numberOfEmployees = sc.nextInt();
            listOfPeople.add(new Company(name, anualIncome, numberOfEmployees));
        }
        sc.close();

        System.out.println("TAXES PAID:");
        for(Person person : listOfPeople){
            System.out.println(person.getName() + ": $ " + person.tax());
        }
        System.out.println("TOTAL TAXES : $ " + listOfPeople.stream().mapToDouble(Person::tax).sum());
    }
}
