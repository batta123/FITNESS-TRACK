package com.fittrack.repository;

import com.fittrack.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {
    // Additional query methods can be defined here if needed
}