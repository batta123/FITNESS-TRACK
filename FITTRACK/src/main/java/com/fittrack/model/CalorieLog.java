package com.fittrack.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "calorie_logs")
public class CalorieLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String meal;

    @Column(nullable = false)
    private int calories;

    @Column(nullable = false)
    private LocalDateTime logDate;

    public CalorieLog() {
    }

    public CalorieLog(Long userId, String meal, int calories, LocalDateTime logDate) {
        this.userId = userId;
        this.meal = meal;
        this.calories = calories;
        this.logDate = logDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public LocalDateTime getLogDate() {
        return logDate;
    }

    public void setLogDate(LocalDateTime logDate) {
        this.logDate = logDate;
    }
}