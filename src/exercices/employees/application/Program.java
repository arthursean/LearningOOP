package exercices.employees.application;

import exercices.employees.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.print("Digite a quantidade de funcionários a serem registrados: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int id;
            String name;
            double salary;
            System.out.println("Funcionário #" + i);
            System.out.print("ID: ");
            id = sc.nextInt();
            while(idTaken(employees, id)){
                System.out.println("ID TAKEN! Try again");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("NAME: ");
            name = sc.nextLine();
            System.out.print("Salary: ");
            salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));
        }
        System.out.print("Selecione o ID do funcionário que deseja aumentar o salário: ");
        int choice = sc.nextInt();
        int index = employees.indexOf(employees.stream().filter(x-> x.getId() == choice).findFirst().orElse(null));
        if(index == -1){
            System.out.println("Não existe funcionário com esse ID, operação abortada");
            System.out.println(employees);
            return;
        }
        System.out.print("Digite a porcentagem do aumento: ");
        double percentage = sc.nextDouble();
        employees.get(index).raise(percentage);
        System.out.println(employees);
        sc.close();
    }
    public static boolean idTaken(List<Employee> list, int id){
        int isTaken = list.indexOf(list.stream().filter(x-> x.getId() == id).findFirst().orElse(null));
        return isTaken != -1;
    }
}
