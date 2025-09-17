package com.fittrack.service;

import com.fittrack.dto.CalorieDto;
import com.fittrack.exception.CustomException;
import com.fittrack.model.CalorieLog;
import com.fittrack.repository.CalorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CalorieService {

    @Autowired
    private CalorieRepository calorieRepository;

    public CalorieLog addCalorieLog(CalorieDto calorieDto) {
        CalorieLog calorieLog = new CalorieLog();
        calorieLog.setUserId(calorieDto.getUserId());
        calorieLog.setCalories(calorieDto.getCalories());
        calorieLog.setMeal(calorieDto.getMeal());
        return calorieRepository.save(calorieLog);
    }

    public List<CalorieLog> getCalorieLogsByUserId(Long userId) {
        return calorieRepository.findByUserId(userId);
    }

    public Optional<CalorieLog> getCalorieLogById(Long id) {
        return calorieRepository.findById(id);
    }

    public CalorieLog updateCalorieLog(Long id, CalorieDto calorieDto) {
        CalorieLog calorieLog = calorieRepository.findById(id)
                .orElseThrow(() -> new CustomException("Calorie log not found"));
        calorieLog.setCalories(calorieDto.getCalories());
        calorieLog.setMeal(calorieDto.getMeal());
        return calorieRepository.save(calorieLog);
    }

    public void deleteCalorieLog(Long id) {
        if (!calorieRepository.existsById(id)) {
            throw new CustomException("Calorie log not found");
        }
        calorieRepository.deleteById(id);
    }
}