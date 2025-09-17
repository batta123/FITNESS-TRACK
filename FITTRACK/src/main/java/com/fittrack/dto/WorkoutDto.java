package com.fittrack.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

public class WorkoutDto {

    private Long id;

    @NotBlank(message = "Workout type is required")
    private String type;

    @NotNull(message = "Duration is required")
    @Positive(message = "Duration must be a positive value")
    private Integer duration; // in minutes

    @NotNull(message = "Calories burned is required")
    @Positive(message = "Calories burned must be a positive value")
    private Integer caloriesBurned;

    private LocalDateTime date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(Integer caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}