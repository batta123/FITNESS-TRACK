import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fittrack.dto.WorkoutDto;
import com.fittrack.service.WorkoutService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    @PostMapping
    public ResponseEntity<WorkoutDto> createWorkout(@Valid @RequestBody WorkoutDto workoutDto) {
        WorkoutDto createdWorkout = workoutService.createWorkout(workoutDto);
        return ResponseEntity.ok(createdWorkout);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkoutDto> getWorkoutById(@PathVariable Long id) {
        WorkoutDto workoutDto = workoutService.getWorkoutById(id);
        return ResponseEntity.ok(workoutDto);
    }

    @GetMapping
    public ResponseEntity<List<WorkoutDto>> getAllWorkouts() {
        List<WorkoutDto> workouts = workoutService.getAllWorkouts();
        return ResponseEntity.ok(workouts);
    }

    @PutMapping("/{id}")
    public ResponseEntity<WorkoutDto> updateWorkout(@PathVariable Long id, @Valid @RequestBody WorkoutDto workoutDto) {
        WorkoutDto updatedWorkout = workoutService.updateWorkout(id, workoutDto);
        return ResponseEntity.ok(updatedWorkout);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorkout(@PathVariable Long id) {
        workoutService.deleteWorkout(id);
        return ResponseEntity.noContent().build();
    }
}