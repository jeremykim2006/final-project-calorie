import java.util.ArrayList;
import java.util.Scanner;

public class CalorieTrackerCLI {
    private static Scanner scanner = new Scanner(System.in);
    private static User user;
    private static Tracker tracker;

    public static void main(String[] args) {
        System.out.println("Welcome to the Calorie Tracker!");

        enterUserInfo();
        tracker = new Tracker(user);

        boolean running = true;
        while (running) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Calculate BMR");
            System.out.println("2. Log a Meal");
            System.out.println("3. View Meal History");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> calculateBMR();
                case 2 -> logMeal();
                case 3 -> viewHistory();
                case 4 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void enterUserInfo() {
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = Integer.parseInt(scanner.nextLine());

    System.out.print("Enter your weight (pounds): ");
    double weightPounds = Double.parseDouble(scanner.nextLine());
    double weightKg = weightPounds * 0.453592; 

    System.out.print("Enter your height (cm): ");
    double height = Double.parseDouble(scanner.nextLine());

    System.out.print("Enter your gender (Male/Female): ");
    String gender = scanner.nextLine();

    System.out.print("Enter your activity level (Sedentary, Light, Moderate, Active, Very Active): ");
    String activityLevel = scanner.nextLine();

    user = new User(name, age, weightKg, height, gender, activityLevel);
    }


    private static void calculateBMR() {
        double bmr = user.calculateBMR();
        System.out.printf("Your estimated daily calorie needs: %.2f calories\n", bmr);
    }

    private static void logMeal() {
        System.out.print("Enter meal name: ");
        String foodName = scanner.nextLine();

        System.out.print("Enter meal calories: ");
        int calories = Integer.parseInt(scanner.nextLine());

        tracker.addMeal(new Meal(foodName, calories));
        System.out.println("Meal logged successfully!");
    }

    private static void viewHistory() {
        ArrayList<Meal> meals = tracker.getMeals();
        if (meals.isEmpty()) {
            System.out.println("No meals logged yet.");
        } else {
            System.out.println("Meal History:");
            for (Meal meal : meals) {
                System.out.println(meal);
            }
            System.out.println("Total Calories Consumed: " + tracker.getTotalCalories());
        }
    }
}
