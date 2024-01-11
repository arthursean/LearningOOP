package exercices2.animals.entities;

public class Dog extends Animal{
    public Dog() {
        super();
    }

    public Dog(Integer age, String name, String breed) {
        super(age, name, breed);
    }

    @Override
    public void sound(){
        System.out.println("AUUUU");
    }
}
