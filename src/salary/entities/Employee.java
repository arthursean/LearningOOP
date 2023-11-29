package salary.entities;

public class Employee {
    public String name;
    public double salaryWithoutTaxes;
    public double tax;
    public double income(){
        return salaryWithoutTaxes - tax;
    }
    public void increaseSalary(double percentage){
        salaryWithoutTaxes *= (1 + percentage/100);
    }
    public String toString(){
        return "Employee: "
                + name
                + ", "
                + "$ "
                + income();
    }
}
