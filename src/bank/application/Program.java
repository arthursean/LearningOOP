package bank.application;

import bank.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        System.out.print("Digite o seu nome completo: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Digite um código para sua conta: ");
        String code = sc.nextLine();
        System.out.println("Deseja criar a conta com saldo?");
        boolean choice = sc.nextBoolean();
        Account client;
        double value;
        if(choice){
            System.out.print("Digite o valor que deseja depositar: ");
            value = sc.nextDouble();
             client = new Account(name, code, value);
        }else{
             client = new Account(name, code);
        }
        System.out.println(client);
        System.out.println("Digite a quantidade que quer depositar em sua conta: ");
        value = sc.nextDouble();
        client.deposit(value);
        System.out.println(client);
        System.out.println("Digite a quantidade que quer sacar da sua conta: ");
        value = sc.nextDouble();
        client.withdraw(value);
        System.out.println(client);
        sc.close();

    }
}
