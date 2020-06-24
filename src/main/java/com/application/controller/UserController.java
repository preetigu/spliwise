package com.application.controller;

import com.application.data.model.User;
import com.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path ="/add")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

}
