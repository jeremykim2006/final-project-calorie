import java.time.LocalDate;

public class Meal {
    private String foodName;
    private int calories;
    private LocalDate date;

    public Meal(String foodName, int calories) {
        this.foodName = foodName;
        this.calories = calories;
        this.date = LocalDate.now();
    }

    public int getCalories() {
        return calories;
    }

    
    public String toString() {
        return date + ": " + foodName + " - " + calories + " cal";
    }
}
