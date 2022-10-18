package com.example.blogPostApp.repository;

import com.example.blogPostApp.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
