package exercices.grades.entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public String passed(){
        double finalGrade= grade1 + grade2 + grade3;
        return grade1 + grade2 + grade3 >= 60.0 ? "FINAL GRADE " + finalGrade
                + "\nPASSED" : "FINAL GRADE "
                + finalGrade
                + "\nFAILED\nMISSING "
                + (60.0 - finalGrade)
                + " POINTS";
    }
    public String toString(){
        return name + "\n" + passed();
    }
}
