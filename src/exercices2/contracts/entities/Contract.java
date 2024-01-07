package exercices2.contracts.entities;

import java.time.LocalDate;

public class Contract {
    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    public Contract(LocalDate date, double valuePerHour, int hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public int getHours() {
        return hours;
    }

    public double totalValue(){
        return hours * valuePerHour;
    }
}
