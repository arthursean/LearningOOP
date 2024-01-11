package exercices2.shipping.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
    private final String name;
    private final String email;
    private final LocalDate birthDate;
    DateTimeFormatter fmr01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Client(String name, String email, LocalDate birthDate){
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

      public LocalDate getBirthDate() {
        return birthDate;
    }


    public String toString(){
        return name
                + " (" + birthDate.format(fmr01) + ") - "
                + email;
    }
}
