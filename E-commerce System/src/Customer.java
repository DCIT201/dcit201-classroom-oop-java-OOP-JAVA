import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    public String email;
    public List<String> cart;

    public Customer(String userId, String name, String email){
        super();
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.cart = new ArrayList<String>();

    }
    public void addItemToCart(String item) {
        cart.add(item);
        System.out.println("Item " + item + "added to cart.");
    }

    public void viewCart() {
        System.out.println("Cart for Customer "+ name +": " +cart);
    }

}
