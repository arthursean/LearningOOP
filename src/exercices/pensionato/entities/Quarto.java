package exercices.pensionato.entities;

public class Quarto {
    private String name;
    private String email;

    public Quarto(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String toString(){
        return "Nome: "
                + name
                + ", Email: "
                + email;
    }
}
