package com.fittrack.repository;

import com.fittrack.model.CalorieLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalorieRepository extends JpaRepository<CalorieLog, Long> {
    // Additional query methods can be defined here if needed
}