package com.example.AttendanceSystem.controller;

import com.example.AttendanceSystem.model.Instructor;
import com.example.AttendanceSystem.request.UserLoginRequest;
import com.example.AttendanceSystem.response.UserResponse;
import com.example.AttendanceSystem.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.regex.Pattern;


@CrossOrigin
@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserService userService;
    BCryptPasswordEncoder passwordEncoder;
    public AuthController(UserService userService) {
        this.userService = userService;
        passwordEncoder = new BCryptPasswordEncoder();
    }


    @PostMapping("/login")
    public UserResponse login(@RequestBody UserLoginRequest userLoginRequest){
        Optional<Instructor> user = Optional.ofNullable((Instructor) userService.getOneUserByUserName(userLoginRequest.getUserName()));
        UserResponse userResponse = new UserResponse();
        if (user.isPresent()){
            Instructor foundUser = user.get();
            /*boolean isPasswordMatch = passwordEncoder.matches(userLoginRequest.getPassword(), foundUser.getPassword());
            if (isPasswordMatch){*/
            userResponse.setId(foundUser.getId());
            userResponse.setUserName(foundUser.getUserName());
            userResponse.setMsg("Login is successful");
            return userResponse;
            /*}else {
                userResponse.setMsg("Invalid Password");
                return userResponse;
            }*/
        }
        else
            userResponse.setMsg("There is not an existing user with user name '"+userLoginRequest.getUserName()+"'");
        return userResponse;
    }


    public boolean checkEmail(String email) {
        // utilizing pattern matching to check for a valid email
        String emailRegex = "^[a-zA-Z0-9+&*-]+(?:\\."+
                "[a-zA-Z0-9+&-]+)@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

}
