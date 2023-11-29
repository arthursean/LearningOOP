package market.application;

import market.entities.Item;

public class Program {
    public static void main(String args[]){
        Item item1 = new Item();
        item1.name = "Geladeira";
        item1.price = 2313.00;
        item1.quant = 12;
        System.out.println(item1);
        item1.remove(2);
        System.out.println(item1);
        item1.add(23);
        System.out.println(item1);
    }
}

