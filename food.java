public abstract class Food {
    protected String name;
    protected String category;
    protected int caloriesPerUnit;

    public Food(String name, String category, int caloriesPerUnit) {
        this.name = name;
        this.category = category;
        this.caloriesPerUnit = caloriesPerUnit;
    }

    public String getName() {
        return name;
    }

    public int getCaloriesPerUnit() {
        return caloriesPerUnit;
    }

    public abstract int calculateCalories(int quantity);

    @Override
    public String toString() {
        return name + " (" + category + ") - " + caloriesPerUnit + " cal/unit";
    }
}
