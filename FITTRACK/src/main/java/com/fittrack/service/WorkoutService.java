package com.fittrack.service;

import com.fittrack.dto.WorkoutDto;
import com.fittrack.exception.CustomException;
import com.fittrack.model.User;
import com.fittrack.model.Workout;
import com.fittrack.repository.UserRepository;
import com.fittrack.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    @Autowired
    private UserRepository userRepository;

    public Workout createWorkout(Long userId, WorkoutDto workoutDto) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new CustomException("User not found"));
        Workout workout = new Workout();
        workout.setUser(user);
        workout.setExercise(workoutDto.getExercise());
        workout.setDuration(workoutDto.getDuration());
        workout.setCaloriesBurned(workoutDto.getCaloriesBurned());
        return workoutRepository.save(workout);
    }

    public List<Workout> getAllWorkouts(Long userId) {
        return workoutRepository.findByUserId(userId);
    }

    public Workout getWorkoutById(Long userId, Long workoutId) {
        return workoutRepository.findByIdAndUserId(workoutId, userId)
                .orElseThrow(() -> new CustomException("Workout not found"));
    }

    public Workout updateWorkout(Long userId, Long workoutId, WorkoutDto workoutDto) {
        Workout workout = getWorkoutById(userId, workoutId);
        workout.setExercise(workoutDto.getExercise());
        workout.setDuration(workoutDto.getDuration());
        workout.setCaloriesBurned(workoutDto.getCaloriesBurned());
        return workoutRepository.save(workout);
    }

    public void deleteWorkout(Long userId, Long workoutId) {
        Workout workout = getWorkoutById(userId, workoutId);
        workoutRepository.delete(workout);
    }
}