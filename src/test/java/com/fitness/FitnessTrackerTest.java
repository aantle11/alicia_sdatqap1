package com.fitness;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class FitnessTrackerTest {
    @Test
    void testWorkoutLoggingAndCalories() {
        FitnessTracker tracker = new FitnessTracker();
        Workout run = new Workout("Running", 30, 300, LocalDate.now());
        tracker.logWorkout(run);

        assertEquals(300, tracker.getTotalCalories());
        assertEquals(1, tracker.getWorkouts().size());
    }

    @Test
    void testGoalSettingAndProgress() {
        FitnessTracker tracker = new FitnessTracker();
        Goal goal = new Goal("Burn 1000 Calories", 1000, 200);
        tracker.setGoal(goal);

        tracker.logWorkout(new Workout("Cycling", 60, 400, LocalDate.now()));
        tracker.logWorkout(new Workout("Swimming", 45, 600, LocalDate.now()));
    }

    @Test
    void testInvalidWorkout() {
        assertThrows(IllegalArgumentException.class, () ->
                new Workout("Running", -30, 200, LocalDate.now()));
    }

    @Test
    void testInvalidGoal() {
        assertThrows(IllegalArgumentException.class, () ->
                new Goal("Impossible goal", -500, 100));
    }
}
