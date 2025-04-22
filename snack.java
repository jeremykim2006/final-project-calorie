public class Snack extends Food {
    private boolean isHealthy;

    public Snack(String name, String category, int caloriesPerUnit, boolean isHealthy) {
        super(name, category, caloriesPerUnit);
        this.isHealthy = isHealthy;
    }

    @Override
    public int calculateCalories(int quantity) {
        return quantity * caloriesPerUnit;
    }

    public boolean isHealthy() {
        return isHealthy;
    }
}
