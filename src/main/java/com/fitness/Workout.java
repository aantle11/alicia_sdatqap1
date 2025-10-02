package com.fitness;

import java.time.LocalDate;

public class Workout {
    private String type;
    private int duration;
    private int caloriesBurned;
    private LocalDate date;

    public Workout(String type, int duration, int caloriesBurned, LocalDate date) {
        if (duration <= 0 || caloriesBurned < 0) {
            throw new IllegalArgumentException("Invalid workout details..");
        }
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
        this.date = date;
    }

    public String getType() {return type;}
    public int getDuration() {return duration;}
    public int getCaloriesBurned() {return caloriesBurned;}
    public LocalDate getDate() {return date;}

    @Override
    public String toString() {
        return type + "(" + duration + "," + caloriesBurned + "cal)";
    }
}
