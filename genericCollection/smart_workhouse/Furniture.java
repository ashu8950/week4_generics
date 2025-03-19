package genericCollection.smart_workhouse;

//class for all the furniture items
public class Furniture extends WarehouseItem{

	Furniture(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	String getItemType() {
		return "Furniture";
	}
}
