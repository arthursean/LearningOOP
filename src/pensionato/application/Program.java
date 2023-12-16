package pensionato.application;

import pensionato.entities.Quarto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos hospedes serão alocados: ");
        int n = sc.nextInt();
        Quarto[] quartos = new Quarto[10];
        for(int i = 1; i <= n; i++){
            System.out.println("Hospede " + i);
            System.out.print("Qual quarto deseja locar? ");
            int quartoEscolhido = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite seu email: ");
            String email = sc.next();
            quartos[quartoEscolhido] = new Quarto(nome, email);
        }
        int i = 0;
        for(Quarto quarto: quartos){
            System.out.print("Quarto #" + i + " ");
            i += 1;
            if(quarto == null){
                System.out.println("Quarto vago");
                continue;
            }
            System.out.println("Quarto ocupado por: " + quarto);
            i+=1;
        }
    }
}
