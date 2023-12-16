package projects.dollars.applicatioln;

import projects.dollars.util.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        System.out.println(CurrencyConverter.finalPriceInReais(price));
        sc.close();
    }
}
