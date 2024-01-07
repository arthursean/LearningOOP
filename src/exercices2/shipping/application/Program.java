package exercices2.shipping.application;

import exercices2.shipping.entities.Client;
import exercices2.shipping.entities.Order;
import exercices2.shipping.entities.OrderItem;
import exercices2.shipping.entities.Product;
import exercices2.shipping.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmr02 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (Day/Month/Year): ");
        LocalDate birthDate = LocalDate.parse(sc.next(), fmr02);
        Client client = new Client(name, email, birthDate);
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.next();
        LocalDateTime moment = LocalDateTime.now();
        Order order = new Order(moment, OrderStatus.valueOf(status), client);
        System.out.print("How many items to this order? ");
        int itemsQuantity = sc.nextInt();
        for(int i = 1; i <= itemsQuantity; i++){
            sc.nextLine();
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            order.addItems(new OrderItem(quantity, new Product(productName, price)));
        }
        System.out.println(order);
    sc.close();
    }
}
