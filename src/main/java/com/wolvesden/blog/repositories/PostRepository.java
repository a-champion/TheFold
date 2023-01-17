package com.wolvesden.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wolvesden.blog.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
    
}
