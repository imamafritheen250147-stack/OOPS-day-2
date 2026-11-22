import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args) {

        ArrayList<String> cart = new ArrayList<>();

        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");

        System.out.println("Shopping Cart: " + cart);

        cart.remove("Mouse");

        System.out.println("Updated Cart: " + cart);

        System.out.println("Total Items: " + cart.size());
    }
}
