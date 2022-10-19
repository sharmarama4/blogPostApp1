package com.example.blogPostApp.service;

import com.example.blogPostApp.model.Userr;
import com.example.blogPostApp.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Userr save(Userr user){
        return userRepository.save(user);
    }
    public List<Userr> getAllUsers() {
        return userRepository.findAll();
    }


}
