package genericCollection.meal_generator;

public class VeganMeal implements MealPlan {
    private String name;

    public VeganMeal(String name) {
        this.name = name;
    }

    @Override
    public boolean isValid() {
        return !name.toLowerCase().contains("dairy"); // no dairy in vegan
    }

    @Override
    public String getName() {
        return name;
    }
}
