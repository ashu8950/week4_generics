package genericCollection.meal_generator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Vegetarian plan
        Meal<VegetarianMeal> vegPlan = new Meal<>();
        MealUtils.generatePlan(
            Arrays.asList(
                new VegetarianMeal("Veg Curry"),
                new VegetarianMeal("Chicken Biryani") // invalid
            ), vegPlan);

        // Vegan plan
        Meal<VeganMeal> veganPlan = new Meal<>();
        MealUtils.generatePlan(
            Arrays.asList(
                new VeganMeal("Tofu Stir Fry"),
                new VeganMeal("Vegan Smoothie with dairy") // invalid
            ), veganPlan);

        // Keto plan
        Meal<KetoMeal> ketoPlan = new Meal<>();
        MealUtils.generatePlan(
            Arrays.asList(
                new KetoMeal("Keto Chicken Bowl", 20),
                new KetoMeal("Pasta", 55) // invalid
            ), ketoPlan);

        // High protein
        Meal<HighProteinMeal> highProteinPlan = new Meal<>();
        MealUtils.generatePlan(
            Arrays.asList(
                new HighProteinMeal("Grilled Salmon", 25),
                new HighProteinMeal("Veggie Salad", 5) // invalid
            ), highProteinPlan);

        // Display results
        System.out.println("=== Vegetarian Meal Plan ===");
        vegPlan.showMeals();

        System.out.println("\n=== Vegan Meal Plan ===");
        veganPlan.showMeals();

        System.out.println("\n=== Keto Meal Plan ===");
        ketoPlan.showMeals();

        System.out.println("\n=== High Protein Meal Plan ===");
        highProteinPlan.showMeals();
    }
}
