package genericCollection.smart_workhouse;

public class SmartWorkHouseSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Smartphone"));
        electronicsStorage.addItem(new Electronics("Laptop"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apples"));
        groceriesStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("All Electronics:");
        WarehouseUtils.displayItems(electronicsStorage.getAllItem());

        System.out.println("\nAll Groceries:");
        WarehouseUtils.displayItems(groceriesStorage.getAllItem());

        System.out.println("\nAll Furniture:");
        WarehouseUtils.displayItems(furnitureStorage.getAllItem());
	}

}
