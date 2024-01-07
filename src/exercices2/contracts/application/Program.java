package exercices2.contracts.application;

import exercices2.contracts.entities.Contract;
import exercices2.contracts.entities.Department;
import exercices2.contracts.entities.Worker;
import exercices2.contracts.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do funcionário: ");
        String name = sc.nextLine();
        System.out.print("Digite o cargo dele. 0 - JUNIOR, 1 - MID_LEVEL, 2 - SENIOR: ");
        int level = sc.nextInt();
        while(!(level >= 0 && level <=3)){
            System.out.println("Nível inválido, digite novamente");
            level = sc.nextInt();
        }
        String levelName;
        if(level == 0){
            levelName = "JUNIOR";
        }
        else if(level == 2){
            levelName = "MID_LEVEL";
        }
        else{
            levelName = "SENIOR";
        }
        System.out.print("Digite o salário base do funcionário: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite o nome do departamento do funcionário: ");
        String depName = sc.nextLine();
        Worker worker = new Worker(name, WorkerLevel.valueOf(levelName), salary, new Department(depName));
        System.out.println("Digite a quantidade de contratos que esse funcionário possui: ");
        int numContracts = sc.nextInt();
        for(int i = 0; i < numContracts; i++){
            System.out.println("Contract #" + (i + 1));
            System.out.print("Digite a data do contrato no formato dd/MM/yyyy: ");
            sc.nextLine();
            LocalDate date = LocalDate.parse(sc.nextLine(), formatter);
            System.out.print("Digite o valor pago pela hora desse contrato: ");
            double value = sc.nextDouble();
            System.out.print("Digite as horas desse contrato: ");
            int hours = sc.nextInt();
            worker.addContract(new Contract(date, value, hours));
        }
        System.out.println("Digite o mês e o ano que deseja ver o salário no formato MM/yyyy: ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println(worker + ", Salário no periodo de " + monthAndYear + ": " + worker.getMonthSalary(year, month));
        sc.close();
    }
}
