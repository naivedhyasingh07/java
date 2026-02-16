import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Product Class
class Product {

    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Display product details
    public void displayProduct() {
        System.out.println("Product: " + name + " | Price: ₹" + price);
    }
}


// ShoppingCart Class
class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    // Add product
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    // Remove product by name
    public void removeProduct(String productName) {
        Iterator<Product> iterator = products.iterator();
        boolean removed = false;

        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equalsIgnoreCase(productName)) {
                iterator.remove();
                System.out.println(productName + " removed from cart.");
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println(productName + " not found in cart.");
        }
    }

    // Calculate total cost
    public double calculateTotalCost() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Display cart
    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Shopping cart is empty.");
        } else {
            System.out.println("---- Shopping Cart ----");
            for (Product product : products) {
                product.displayProduct();
            }
            System.out.println("-----------------------");
            System.out.println("Total Cost: ₹" + calculateTotalCost());
        }
    }
}


// Main Class
public class ShoppingCartApp {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        // Create products
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Headphones", 2000);
        Product p3 = new Product("Mouse", 800);

        // Add products
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        // Display cart
        cart.displayCart();

        // Remove product
        System.out.println("\nRemoving Headphones...");
        cart.removeProduct("Headphones");

        // Display cart again
        cart.displayCart();
    }
}
