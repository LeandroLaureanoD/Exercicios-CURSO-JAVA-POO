import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }
    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    public Date getMoment() {
        return moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public Client getClient() {
        return client;
    }
    public List<OrderItem> getItems() {
        return items;
    }
    //Method
    public void addItem(OrderItem item){

        items.add(item);
    }
    public void removeItem(OrderItem item){

        items.remove(item);
    }
    public double total(){
        double sum = 0;
        for (OrderItem valueItem : items){
            sum += valueItem.subTotal();
        }
        return sum;
    }
    @Override
    public String toString() {
        return  "ODER SUMMARY: " + "\n" +
                "_____________________________________________________________________" + "\n" +
                "Order moment: " + getMoment() + "\n" +
                "Order status: " + getStatus() + "\n" +
                "Client: " + getClient().getNameClient() + " " + "(" + getClient().getBirthDateClient() + ")" + " - " + getClient().getEmailClient() + "\n\n" +
                "ORDER ITEMS: " + "\n" +
                "_____________________________________________________________________";
    }
}
