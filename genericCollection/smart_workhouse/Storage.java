package genericCollection.smart_workhouse;
import java.util.List;
import java.util.ArrayList;

//it's a class for storing and accessing item
public class Storage<T extends WarehouseItem> {
	private List<T>list = new ArrayList<>();
	
	//adding item to the list
	void addItem(T item) {
		list.add(item);
	}
	
	//getting item from particular idx
	T getItem(int idx) {
		return list.get(idx);
	}
	
	//accessing all the element from the list
	List<T> getAllItem() {
		return list;
	}
}
