package exercices.employees.entities;

public class Employee {
    private final int id;
    private final String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void raise(double percentage){
        salary *= percentage/100+1;
    }

    public double getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    public String toString(){
        return "ID: " + id + ", NAME: " + name + ", SALARY: " + salary;
    }
}
