package genericCollection.meal_generator;

public class VegetarianMeal implements MealPlan{
	private String name;
	
	VegetarianMeal(String name){
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return name.toLowerCase().contains("veg");
	}
}
