package exercices2.products.application;

import exercices2.products.entities.ImportedProduct;
import exercices2.products.entities.Product;
import exercices2.products.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int quantity = sc.nextInt();
        List<Product> productsList = new ArrayList<>();
        for(int i = 1; i <= quantity; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char choice = Character.toLowerCase(sc.next().charAt(0));
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(choice == 'u'){
                System.out.print("Manufacture date (dd/MM/yyyy): ");
                productsList.add(new UsedProduct(name, price, LocalDate.parse(sc.next(), fmt01)));
                continue;
            }
            if(choice == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                productsList.add(new ImportedProduct(name, price, customsFee));
                continue;
            }
            productsList.add(new Product(name, price));
        }
        System.out.println("PRICE TAGS:");
        for(Product product : productsList){
            System.out.println(product.priceTag());
        }
    }
}
