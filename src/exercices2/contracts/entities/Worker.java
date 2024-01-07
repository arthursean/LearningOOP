package exercices2.contracts.entities;

import exercices2.contracts.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    List<Contract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void addContract(Contract contract){
        contracts.add(contract);
    }

    public void removeContract(Contract contract){
        contracts.remove(contract);
    }

    public double getMonthSalary(int year, int month){
        return baseSalary + contracts.stream().filter(x -> x.getDate().getMonthValue() == month && x.getDate().getYear() == year).mapToDouble(Contract::totalValue).sum();
    }

    public String toString(){
        return "Nome: "
                + name
                + ", Departamento: "
                + this.department.getName();
    }
}
