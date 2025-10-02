package com.fitness;

import java.util.ArrayList;
import java.util.List;

public class FitnessTracker {
    private List<Workout> workouts;
    private Goal goal;

    public FitnessTracker() {
        workouts = new ArrayList<>();
    }

    public void logWorkout(Workout workout) {
        workouts.add(workout);
        if(goal != null) {
            goal.addProgress(workout.getCaloriesBurned());
        }
    }

    public int getTotalCalories() {
        return workouts.stream().mapToInt(Workout::getCaloriesBurned).sum();
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    public Goal getGoal() {
        return goal;
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }
}

