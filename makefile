User.class: User.java
	javac -g User.java

Meal.class: Meal.java
	javac -g Meal.java

Tracker.class: Tracker.java User.class Meal.class
	javac -g Tracker.java

CalorieTrackerCLI.class: CalorieTrackerCLI.java Tracker.class Meal.class User.class
	javac -g CalorieTrackerCLI.java

testCLI: CalorieTrackerCLI.class
	java CalorieTrackerCLI

clean:
	rm -f *.class
