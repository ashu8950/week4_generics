package genericCollection.online_market;
import java.util.List;
import java.util.ArrayList;
public class ProductCatalog {
	List<Product<?>> products = new ArrayList<>();
	
	//adding product to the list of products
	void addProducts(Product<?>product) {
		products.add(product);
	}
	
	//displaying the products
	void showCatalog() {
		System.out.println("Product catalog : ");
		for(Product<?>p : products) {
			System.out.println(p);
		}
	}
}
