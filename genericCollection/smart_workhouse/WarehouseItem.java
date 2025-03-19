package genericCollection.smart_workhouse;

//it's base class for all the item furniture ,electronic and groceries
public abstract class WarehouseItem {
	private String name;
	WarehouseItem(String name){
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	abstract String getItemType();
	
	 @Override
	    public String toString() {
	        return getItemType() + ": " + name;
	    }
}
