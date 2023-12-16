package exercices.peoplelist.entities;

public class Person {
    private final String name;
    private double height;
    private int age;

    public Person(String name, double height, int age){
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void ageUp(){
        age += 1;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String toString(){
        return name + ", " + height + ", " + age;
    }
}
