package genericCollection.meal_generator;

//Base interface for all meal types
public interface MealPlan {
 String getName();
 boolean isValid(); // Validation logic for each meal
}
