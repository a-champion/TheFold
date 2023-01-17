package com.wolvesden.blog.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wolvesden.blog.repositories.PostRepository;
import com.wolvesden.blog.entities.Post;

@RestController
public class PostController {

    public PostRepository Posts;

    public PostController(PostRepository Posts){
        this.Posts = Posts;
    }
    

    // index
    @CrossOrigin
    @GetMapping("/posts")
    public List<Post> index(){
        return Posts.findAll();
    }

    //Read
    @CrossOrigin
    @GetMapping("/posts/{id}")
    public Optional<Post> show(@PathVariable Integer id) {
        return Posts.findById(id);
    }

    //create
    @CrossOrigin
    @PostMapping("/posts")
    public List<Post> create(@RequestBody Post newPost){
        Posts.save(newPost);
        return Posts.findAll();
    }
    //Update
    @CrossOrigin
    @PutMapping("/posts/{id}")
    public List<Post> update(@RequestBody Post fixPost, @PathVariable Integer id) {
        Posts.findById(id).map(post -> {

            post.setPostedBy(fixPost.getPostedBy());
            post.setContentURL(fixPost.getContentURL());
            post.setBody(fixPost.getBody());
            Posts.save(post);
            return post;
        });
        return Posts.findAll();
    }
    //Delete
    @CrossOrigin
    @DeleteMapping("/posts/{id}")
    public List<Post> destroy(@PathVariable Integer id){
        Posts.deleteById(id);
        return Posts.findAll();
    }

}
