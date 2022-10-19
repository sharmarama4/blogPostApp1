package com.example.blogPostApp.controller;

import com.example.blogPostApp.model.Userr;
import com.example.blogPostApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller

public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registerPage")
    public String showRegistrationForm(Model model){

            Userr user = new Userr();
            model.addAttribute("user", user);
            model.addAttribute("users",userService.getAllUsers());
             return"registerPage";
        }


    @PostMapping("/registerPage")
    public String createNewUsers( @ModelAttribute("user") Userr user) {
        userService.save(user);
        return"redirect:/registerPage";
    }



}


