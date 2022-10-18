package com.example.blogPostApp.controller;

import com.example.blogPostApp.model.Post;
import com.example.blogPostApp.service.PostService;
import com.example.blogPostApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class PostController {
    @Autowired
    private PostService postService;

    @Autowired
    private UserService accountService;

    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable Long id, Model model) {
        return null;
    }

    @GetMapping("/posts/new")
    public String createNewPost(Model model){
        return null;
    }
    @PostMapping("/posts/new")
    public String saveNewPost(@ModelAttribute Post post){
        return null;
    }
}
