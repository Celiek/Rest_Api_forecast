package com.example.weather.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUser(){
        return userService.getUser();
    }

    @PostMapping
    public void registerNewUser(@RequestBody User user) {
        userService.addNewUser(user);
    }
    //for debug purpose only,
    //further i will remowe it
    public void deleteStudent(@PathVariable("userId") Long userId){
        userService.deleteUser(userId);
    }

    public void updateUser(@PathVariable("studentId") Long userId,
                           @RequestParam(required = false) String name,
                           @RequestParam(required = false)String email){
        userService.updateUser(userId, name, email);
    }

}
