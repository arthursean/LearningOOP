package encaps.entities;

public class Product {
    private int quantity;
    private double price;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }//sobrecarga para poder mandar tb sem parametros
    public Product(){}

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Data: "
                + name
                + ", $ "
                + price
                + ", Quantidade em estoque: "
                + ". Valor total em estoque : "
                + price * quantity;
    }


}
