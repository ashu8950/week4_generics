package collection_framework.projects.shopping_cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {
    // Product catalog: product -> price
    private HashMap<String, Double> productPrices = new HashMap<>();

    // Cart: product -> quantity 
    private LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();

    // Add product to catalog
    public void addProduct(String name, double price) {
        productPrices.put(name, price);
    }

    // Add item to cart
    public void addToCart(String name, int quantity) {
        if (!productPrices.containsKey(name)) {
            System.out.println("Product not found: " + name);
            return;
        }
        cart.put(name, cart.getOrDefault(name, 0) + quantity);
    }

    // Display cart items in the order they were added
    public void showCartInOrder() {
        System.out.println("Cart (Insertion Order):");
        for (String item : cart.keySet()) {
            System.out.printf("%s × %d (%.2f each)\n", item, cart.get(item), productPrices.get(item));
        }
    }

    // Display items sorted by price
    public void showCartSortedByPrice() {
        TreeMap<Double, List<String>> sorted = new TreeMap<>();

        for (String item : cart.keySet()) {
            double price = productPrices.get(item);
            sorted.computeIfAbsent(price, k -> new ArrayList<>()).add(item);
        }

        System.out.println("Cart (Sorted by Price):");
        for (Map.Entry<Double, List<String>> entry : sorted.entrySet()) {
            double price = entry.getKey();
            for (String item : entry.getValue()) {
                System.out.printf("%s × %d (%.2f each)\n", item, cart.get(item), price);
            }
        }
    }

    // Calculate total bill
    public double getTotal() {
        double total = 0.0;
        for (String item : cart.keySet()) {
            total += productPrices.get(item) * cart.get(item);
        }
        return total;
    }
}