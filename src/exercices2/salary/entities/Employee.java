package exercices2.salary.entities;

public class Employee {
    private String name;
    private Double salaryPerHour;
    private Integer hours;

    public Employee() {
    }
    public Employee(String name, Double salaryPerHour, Integer hours) {
        this.name = name;
        this.salaryPerHour = salaryPerHour;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(Double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double payment(){
        return salaryPerHour * hours;
    }
    public String toString(){
        return name + " - $ " + payment();
    }
}
