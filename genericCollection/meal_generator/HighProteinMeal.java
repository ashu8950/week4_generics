package genericCollection.meal_generator;

public class HighProteinMeal implements MealPlan {
    private String name;
    private int protein;

    public HighProteinMeal(String name, int protein) {
        this.name = name;
        this.protein = protein;
    }

    @Override
    public boolean isValid() {
        return protein >= 20;
    }

    @Override
    public String getName() {
        return name + " (Protein: " + protein + "g)";
    }
}

