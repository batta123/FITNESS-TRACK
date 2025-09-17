package com.fittrack.controller;

import com.fittrack.dto.WorkoutDto;
import com.fittrack.dto.CalorieDto;
import com.fittrack.service.WorkoutService;
import com.fittrack.service.CalorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    private final WorkoutService workoutService;
    private final CalorieService calorieService;

    @Autowired
    public DashboardController(WorkoutService workoutService, CalorieService calorieService) {
        this.workoutService = workoutService;
        this.calorieService = calorieService;
    }

    @GetMapping("/workouts")
    public List<WorkoutDto> getWorkoutStats() {
        return workoutService.getWeeklyWorkoutStats();
    }

    @GetMapping("/calories")
    public List<CalorieDto> getCalorieStats() {
        return calorieService.getWeeklyCalorieStats();
    }

    // Additional methods for monthly statistics can be added here
}