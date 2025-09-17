package com.fittrack.controller;

import com.fittrack.dto.UserDto;
import com.fittrack.exception.CustomException;
import com.fittrack.model.User;
import com.fittrack.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public ResponseEntity<UserDto> getUserProfile(@AuthenticationPrincipal User user) {
        UserDto userDto = userService.getUserProfile(user.getId());
        return ResponseEntity.ok(userDto);
    }

    @PutMapping("/profile")
    public ResponseEntity<UserDto> updateUserProfile(@AuthenticationPrincipal User user, 
                                                      @Valid @RequestBody UserDto userDto) {
        UserDto updatedUserDto = userService.updateUserProfile(user.getId(), userDto);
        return ResponseEntity.ok(updatedUserDto);
    }
}