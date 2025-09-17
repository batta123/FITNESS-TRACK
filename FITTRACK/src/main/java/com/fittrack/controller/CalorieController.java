package com.fittrack.controller;

import com.fittrack.dto.CalorieDto;
import com.fittrack.model.CalorieLog;
import com.fittrack.service.CalorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/calories")
public class CalorieController {

    @Autowired
    private CalorieService calorieService;

    @PostMapping
    public ResponseEntity<CalorieLog> addCalorieLog(@Valid @RequestBody CalorieDto calorieDto) {
        CalorieLog calorieLog = calorieService.addCalorieLog(calorieDto);
        return new ResponseEntity<>(calorieLog, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CalorieLog> getCalorieLog(@PathVariable Long id) {
        CalorieLog calorieLog = calorieService.getCalorieLogById(id);
        return new ResponseEntity<>(calorieLog, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CalorieLog>> getAllCalorieLogs() {
        List<CalorieLog> calorieLogs = calorieService.getAllCalorieLogs();
        return new ResponseEntity<>(calorieLogs, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CalorieLog> updateCalorieLog(@PathVariable Long id, @Valid @RequestBody CalorieDto calorieDto) {
        CalorieLog updatedCalorieLog = calorieService.updateCalorieLog(id, calorieDto);
        return new ResponseEntity<>(updatedCalorieLog, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCalorieLog(@PathVariable Long id) {
        calorieService.deleteCalorieLog(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}