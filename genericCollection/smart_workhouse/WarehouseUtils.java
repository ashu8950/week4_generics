package genericCollection.smart_workhouse;
import java.util.List;
public class WarehouseUtils {
	
	//method for displaying item form warehouse
	public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}
