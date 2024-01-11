package exercices2.animals.entities;

public class Siames extends Cat{
    public Siames() {
    }

    public Siames(Integer age, String name, String breed) {
        super(age, name, breed);
    }

    @Override
    public void sound(){
        super.sound();
        System.out.println("Sou siames");
    }
}
