package genericCollection.meal_generator;

import java.util.List;

//Utility class for generic operations
public class MealUtils {

 // Generic method to generate personalized meal plan
 public static <T extends MealPlan> void generatePlan(List<T> rawMeals, Meal<T> mealContainer) {
     for (T meal : rawMeals) {
         mealContainer.addMeal(meal);
     }
 }
}
