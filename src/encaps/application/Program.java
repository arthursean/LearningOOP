package encaps.application;

import encaps.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        Product item = new Product(name, price, quantity);
        System.out.println(item);

        sc.close();
    }
}
