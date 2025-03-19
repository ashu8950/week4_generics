package genericCollection.smart_workhouse;

//it's a class for all the groceries item
public class Groceries extends WarehouseItem{

	Groceries(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	String getItemType() {
		return "Groceries";
	}
     
}
