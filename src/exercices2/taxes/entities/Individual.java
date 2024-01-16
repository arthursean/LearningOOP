package exercices2.taxes.entities;

public class Individual extends Person{
    private Double medicalExpenses;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double medicalExpenses) {
        super(name, anualIncome);
        this.medicalExpenses = medicalExpenses;
    }

    public Double getMedicalExpenses() {
        return medicalExpenses;
    }

    public void setMedicalExpenses(Double medicalExpenses) {
        this.medicalExpenses = medicalExpenses;
    }

    @Override
    public Double tax(){
        if(getAnualIncome() >= 20000){
            return getAnualIncome() * 0.25 - (medicalExpenses/2);
        }
        return getAnualIncome() * 0.15 - (medicalExpenses/2);
    }
}
