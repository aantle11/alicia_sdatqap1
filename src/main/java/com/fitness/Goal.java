package com.fitness;

public class Goal {
    private String description;
    private int targetCalories;
    private int currentCalories;

    public Goal(String description, int targetCalories, int currentCalories) {
        if (targetCalories <= 0) {
            throw new IllegalArgumentException("targetCalories must be positive");
        }
        this.description = description;
        this.targetCalories = targetCalories;
        this.currentCalories = 0;
    }

    public void addProgress(int calories) {
        if (calories < 0) {
            throw new IllegalArgumentException("calories must be positive");
        }
        this.currentCalories += calories;
    }

    public boolean isGoalAchieved() {
        return currentCalories >= targetCalories;
    }

    public boolean isGoalAchieved() {
        return currentCalories >= targetCalories;
    }

    public String  getDescription() { return description; }
    public int getTargetCalories() { return targetCalories; }
    public int getCurrentCalories() { return currentCalories; }
}
