package exercices2.shipping.entities;

import exercices2.shipping.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
    DateTimeFormatter fmr01 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private final List<OrderItem> items = new ArrayList<>();

    public Order(){}

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItems(OrderItem newItem) {
        items.add(newItem);
    }
    public void removeItems(OrderItem newItem) {
        items.remove(newItem);
    }

    public Double total(){
        return items.stream().mapToDouble(OrderItem::subTotal).sum();
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: ");
        sb.append(moment.format(fmr01) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client + "\n");
        sb.append("Order items:\n");
        String toAppend = items.stream().map(OrderItem::toString).collect(Collectors.joining("\n"));
        sb.append(toAppend + "\n");
        sb.append("Total price: $" + total());
        return sb.toString();
    }

}
