package market.application;

import market.entities.Item;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double price = sc.nextDouble();
        //int quant = sc.nextInt();
        sc.close();
        Item item1 = new Item(name, price);
        System.out.println(item1);
        item1.remove(2);
        System.out.println(item1);
        item1.add(23);
        System.out.println(item1);
    }
}

