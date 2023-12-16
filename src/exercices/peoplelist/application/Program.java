package exercices.peoplelist.application;

import exercices.peoplelist.entities.Person;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List<Person> list = new ArrayList<>();
        list.add(new Person("Arthur", 1.73, 19));
        list.add(new Person("Joca", 1.75, 19));

        for(Person x : list){
            if(x.getName().equals("Arthur")){
                x.setHeight(x.getHeight() + 0.03);
            }
            System.out.println(x);
        }
    }
}
