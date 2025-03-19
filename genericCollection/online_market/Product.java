package genericCollection.online_market;

//product class for Type category
public class Product<Category> {
	private String name;
	private double price;
	private Category category;
	//initializing the instance var
	Product(String name,double price,Category category){
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	String getName() {
		return name;
	}
	
	double getPrice() {
		return price;
	}
	
	Category getCategory() {
		return category;
	}
	
	void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" +String.format("%.2f",price) + ", category=" + category + "]";
	}
	
	
	
}
