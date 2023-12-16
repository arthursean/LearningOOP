package projects.encaps.entities;

public class Product {
    private int quantity;
    private double price;
    private String name;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }//sobrecarga para poder mandar tb sem parametros
    public Product(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
        if(this.quantity < 0){
            this.quantity = 0;
        }
    }
    public String toString(){
        return "Data: "
                + name
                + ", $ "
                + price
                + ", Quantidade em estoque: "
                + quantity
                + ", Valor total em estoque : "
                + price * quantity;
    }


}
