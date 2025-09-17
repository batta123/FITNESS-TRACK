package com.fittrack.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class CalorieDto {

    @NotNull(message = "Food name cannot be null")
    private String foodName;

    @NotNull(message = "Calories cannot be null")
    @Positive(message = "Calories must be a positive number")
    private Integer calories;

    @NotNull(message = "Date cannot be null")
    private String date;

    public CalorieDto() {
    }

    public CalorieDto(String foodName, Integer calories, String date) {
        this.foodName = foodName;
        this.calories = calories;
        this.date = date;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}