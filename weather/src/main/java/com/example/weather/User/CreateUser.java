package com.example.weather.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/createuser")
public class CreateUser {

    @GetMapping(path="user")
    public String createUser(){
        return "UserCreated";
    }
}
