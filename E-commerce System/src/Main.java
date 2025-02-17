import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ECommerceSystem system = new ECommerceSystem();

        Customer Customer1 = new Customer("C001", "Alice", "alice@example.com");
        Customer Customer2 = new Customer("C002", "Bob", "bob@example.com");
        Admin Admin1 = new Admin("A001", Arrays.asList("Manage Orders", "View Reports"));

        system.registerUser(Customer1);
        system.registerUser(Customer2);
        system.registerUser(Admin1);

        Customer1.addItemToCart("Laptop");
        Customer1.addItemToCart("Mouse");
        Customer2.addItemToCart("Smartphone");
        Customer2.addItemToCart("Headphones");


        Order order1 = new Order("001", Customer1.userId, new ArrayList<>(Arrays.asList("Mouse", "Blue", "Device")));
        Order order2 = new Order("002", Customer1.userId, new ArrayList<>(Arrays.asList("Scarf", "Magenta", "Clothing")));

        List<String> orderDetails = new ArrayList<>(Arrays.asList("Mouse", "Blue", "Device"));


        system.placeOrder(Customer1.userId, Customer1.cart);
        system.placeOrder(Customer2.userId, Customer2.cart);

        Admin1.addPermission("Edit Products");

        system.viewAllUsers();
        system.viewAllOrders();
    }
}