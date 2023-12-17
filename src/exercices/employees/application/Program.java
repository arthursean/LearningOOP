package exercices.employees.application;

import exercices.employees.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        }else{
            System.out.print("Digite a porcentagem do aumento: ");
            double percentage = sc.nextDouble();
            employees.get(index).raise(percentage);
        }
        sc.close();
        System.out.println(employees);
        List<Employee> under9k = employees.stream().filter(x -> x.getSalary() < 9000).collect(Collectors.toList());
        List<Employee> above9k = employees.stream().filter(x -> x.getSalary() >= 9000).collect(Collectors.toList());//Usando apenas o .toList() gera uma lista imutável
        System.out.println("Funcionarios com salário menor que 9k:");
        for(Employee x : under9k){
            System.out.println(x);
        }
        System.out.println("Funcionários com salário maior ou igual que 9k:");
        for(Employee x: above9k){
            System.out.println(x);
        }
    }
    public static boolean idTaken(List<Employee> list, int id){
        int isTaken = list.indexOf(list.stream().filter(x-> x.getId() == id).findFirst().orElse(null));
        return isTaken != -1;
    }
    public static void removeBySalary(List<Employee> list, double salary){
        list.removeIf(x -> x.getSalary() > salary);
    }
}
