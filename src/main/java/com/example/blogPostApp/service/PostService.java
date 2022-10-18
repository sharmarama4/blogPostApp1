package com.example.blogPostApp.service;

import com.example.blogPostApp.model.Post;
import com.example.blogPostApp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Optional<Post> getById(Long id) {

        return null;
    }

    public List<Post> getAllPosts() {

        //TODO by default it will be listed from most recent ones

        return null;
    }

    public Post save(Post post) {

        return null;
    }

    public List<Post> sortByOldest() {

        return null;
    }

    public List<Post> sortByPopularity() {
        return null;
    }


}