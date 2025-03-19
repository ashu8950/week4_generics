package genericCollection.smart_workhouse;

//it's the class for electronic item
public class Electronics extends WarehouseItem {

	Electronics(String name) {
		super(name);
	}
	
	@Override
	String getItemType() {
		return "Electronic Item";
	}

}
