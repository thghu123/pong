package com.chu.pong.meta.user.controller;

import com.chu.pong.meta.user.dto.CreateUserRequest;
import com.chu.pong.meta.user.dto.UserLoginRequest;
import com.chu.pong.meta.user.dto.UserLoginResponse;
import com.chu.pong.meta.user.dto.UserResponse;
import com.chu.pong.meta.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/v1/join")
    public ResponseEntity<UserResponse> join(@RequestBody CreateUserRequest request) {
        return ResponseEntity.ok(
                UserResponse.from(
                        userService.join(request.toEntity())));
    }

    @PostMapping("/v1/login")
    public ResponseEntity<UserLoginResponse> login(@RequestBody UserLoginRequest request) {
        return ResponseEntity.ok(
                UserLoginResponse.from(
                        userService.login(request.toEntity())));
    }

    @GetMapping("/v1/me")
    public ResponseEntity<UserResponse> me(@RequestParam long userId) {
        return ResponseEntity.ok(
                UserResponse.from(userService.getById(userId)));
    }
}
