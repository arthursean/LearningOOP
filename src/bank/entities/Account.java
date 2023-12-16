package bank.entities;

public class Account {
    private String name;
    private final String code;
    private double balance;

    public Account(String name, String code, double balance){
      this.name = name;
      this.code = code;
      deposit(balance);
    }
    public Account(String name, String code){
        this.name = name;
        this.code = code;
    }
    public void deposit(double value){
        balance += value;
    }
    public void withdraw(double value){
        balance -= (value + 5);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getCode(){
        return code;
    }
    public double getBalance(){
        return balance;
    }
    public String toString(){
        return "Código da conta: "
                + code
                + ", Nome: "
                + name
                + ", Saldo: "
                + balance;
    }
}
