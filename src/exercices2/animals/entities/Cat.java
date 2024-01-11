package exercices2.animals.entities;

public class Cat extends Animal {
    public Cat() {
        super();
    }

    public Cat(Integer age, String name, String breed) {
        super(age, name, breed);
    }

    @Override
    public void sound(){
        System.out.println("Miau");
    }
}
