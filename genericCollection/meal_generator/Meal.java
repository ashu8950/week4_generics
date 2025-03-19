package genericCollection.meal_generator;

import java.util.ArrayList;
import java.util.List;

// Generic container for meal plans
public class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    public void addMeal(T meal) {
        if (meal.isValid()) {
            meals.add(meal);
        } else {
            System.out.println("Invalid meal: " + meal.getName());
        }
    }

    public void showMeals() {
        for (T meal : meals) {
            System.out.println(meal.getName());
        }
    }

    public List<T> getMeals() {
        return meals;
    }
}

