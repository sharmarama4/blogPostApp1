package com.example.blogPostApp.controller;

import com.example.blogPostApp.model.Userr;
import com.example.blogPostApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class RegisterController {

    @Autowired
    private UserService accountService;


    @GetMapping("/register")
    public String getRegisterPage(Model model){
       return null;
    }

    @PostMapping("/register")
    public String registerNewUser(@ModelAttribute Userr user) {
        return  null;
    }
}
