package collection_framework.projects.shopping_cart;

public class Main {
	 public static void main(String[] args) {
	        ShoppingCart shop = new ShoppingCart();

	        // Add products
	        shop.addProduct("Apple", 1.50);
	        shop.addProduct("Banana", 0.75);
	        shop.addProduct("Milk", 2.50);
	        shop.addProduct("Bread", 1.20);

	        // Add to cart
	        shop.addToCart("Milk", 2);
	        shop.addToCart("Apple", 4);
	        shop.addToCart("Banana", 6);
	        shop.addToCart("Bread", 1);

	        // Show cart in order and by price
	        shop.showCartInOrder();
	        shop.showCartSortedByPrice();

	        // Total
	        System.out.printf("Total: $%.2f\n", shop.getTotal());
	    }
}
