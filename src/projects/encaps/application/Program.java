package projects.encaps.application;

import projects.encaps.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        Product item = new Product();
        item.setName(name);
        item.setPrice(price);
        System.out.println(item);
        item.addProducts(quantity);
        System.out.println(item);
        item.removeProducts(quantity/2);
        System.out.println(item);
        sc.close();
    }
}
