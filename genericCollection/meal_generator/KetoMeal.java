package genericCollection.meal_generator;

public class KetoMeal implements MealPlan {
    private String name;
    private int carbs;

    public KetoMeal(String name, int carbs) {
        this.name = name;
        this.carbs = carbs;
    }

    @Override
    public boolean isValid() {
        return carbs < 30; // Keto is low-carb
    }

    @Override
    public String getName() {
        return name + " (Carbs: " + carbs + "g)";
    }
}
