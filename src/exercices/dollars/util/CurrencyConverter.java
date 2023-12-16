package exercices.dollars.util;

public class CurrencyConverter {
    public static double dollar = 4.97;
    public static double finalPriceInReais(double price){
        double priceInReais = dollar * price;
        return priceInReais *= 1.06;
    }
}
