package genericCollection.online_market;

public class DiscountUtil {
	static <T extends Product<?>> void applyDiscount(T product, double percentage) {
		double price = product.getPrice();
		double discount = price *(percentage/100);
		product.setPrice(price -discount);
		System.out.println("Discount applied to " + product.getName() + ": new price = $" + String.format("%.2f", product.getPrice()));
	}
}
