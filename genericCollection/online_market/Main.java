package genericCollection.online_market;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<BookCategory> book = new Product<>("Java for Beginners", 29.99, BookCategory.EDUCATIONAL);
		Product<ClothingCategory> shirt = new Product<>("T-Shirt", 15.99, ClothingCategory.MEN);
		Product<GadetCategory> phone = new Product<>("Smartphone", 599.99, GadetCategory.MOBILE);
		
		   DiscountUtil.applyDiscount(book, 10);
	        DiscountUtil.applyDiscount(phone, 15);

	        ProductCatalog catalog = new ProductCatalog();
	        catalog.addProducts(book);
	        catalog.addProducts(shirt);
	        catalog.addProducts(phone);

	        catalog.showCatalog();
		
	}

}
