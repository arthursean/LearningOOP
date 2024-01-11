package exercices2.animals.application;

import exercices2.animals.entities.Animal;
import exercices2.animals.entities.Cat;
import exercices2.animals.entities.Dog;
import exercices2.animals.entities.Siames;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List<Animal> animals = new  ArrayList<>();
        animals.add(new Dog(18, "Bidu", "Fox Paulistinha"));
        animals.add(new Cat(10, "Jobson", "Persa"));
        animals.add(new Cat(2, "Luca", "Vira-Lata"));
        animals.add(new Siames(2, "Lucsa", "Siames"));

        for(Animal ani : animals){
            System.out.println(ani);
            ani.sound();
        }
        Animal animal = new Dog(5,"Charlotte", "French Bulldog");
        Dog dog = (Dog)animal;
    }
}
