package exercices2.animals.entities;

public class Animal {
    private Integer age;
    private String name;
    private String breed;

    public Animal( ) {

    }

    public Animal(Integer age, String name, String breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void sound(){
        System.out.println("Sound");
    }
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
