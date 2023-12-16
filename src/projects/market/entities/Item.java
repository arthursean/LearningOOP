package projects.market.entities;

public class Item {
    public int quant;
    public double price;
    public String name;

    public Item(){}
    public Item(String name, double price, int quant){
        this.name = name;
        this.price = price;
        this.quant = quant;
    }

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
    public double calculate(){
        return quant * price;
    }
    public void add(int quant){
        this.quant += quant;
    }
    public void remove(int quant){
        this.quant -= quant;
    }
    public String toString(){
        return  "Info: " + name
                + ", estoque: "
                + quant
                + ", R$: "
                + String.format("%.2f", price)
                + ", "
                + String.format("%.2f", calculate());

    }
}
