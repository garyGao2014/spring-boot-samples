package com.gary.example.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @PostMapping(value = "/add")
    public User add(@RequestBody @Valid User user) {
        System.out.println(user);
        return user;
    }
}
