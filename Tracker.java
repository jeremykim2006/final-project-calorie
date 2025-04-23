import java.util.ArrayList;

public class Tracker {
    private ArrayList<Meal> meals;
    private User user;

    public Tracker(User user) {
        this.user = user;
        this.meals = new ArrayList<>();
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public int getTotalCalories() {
        int total = 0;
        for (Meal meal : meals) {
            total += meal.getCalories();
        }
        return total;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }
}
