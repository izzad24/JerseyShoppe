package com.wayne.jerseyshop.controller;

import org.springframework.web.bind.annotation.RestController;

import com.wayne.jerseyshop.entity.User;

import org.springframework.web.bind.annotation.GetMapping;


/**
 * UserController
 */
@RestController
public class UserController {

    @GetMapping(value="/users")
    public User getUser() {
        User user = new User();

        user.setName("Bruce Wayne");
        user.setEmail("imbatman@wayne.com");
        user.setMobile(01122334455);
        user.setBirthday("30-01-1974");
        user.setGender("male");
        user.setImgurl("http://thetransformedmale.files.wordpress.com/2011/06/bruce-wayne-armani.jpg");
        return user;
    }
    
}