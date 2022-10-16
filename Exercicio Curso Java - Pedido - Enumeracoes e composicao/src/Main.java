import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("ENTER CLIENT DATA: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String date = sc.nextLine();

        Date dataHoraAtual = new Date();
        String dateNow = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(dataHoraAtual);

        Date format = f.parse(date);
        Date dateNowH = f.parse(dateNow);

        System.out.println("ENTER ORDER DATA: ");
        System.out.print("Status: ");
        String orderStatus = sc.nextLine();

        Order order = new Order(dateNowH, OrderStatus.valueOf(orderStatus), new Client(name, email, format));

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter # " + (i + 1) + " item data: ");
            sc.nextLine();
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println(order);
        for(OrderItem emp : order.getItems()){
            System.out.println(emp.getProduct().getNameProduct() + ", " + "$" + emp.getProduct().getPrice() + ", " + "Quantity: " + emp.getQuantity() + " Subtotal: " + emp.subTotal());
        }
        System.out.println("_____________________________________________________________________");
        System.out.print("Total price: " + order.total());
        sc.close();
    }
}
