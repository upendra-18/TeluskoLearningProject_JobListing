package com.TLP.joblisting.controller;

import com.TLP.joblisting.repository.PostRepository;
import com.TLP.joblisting.model.Post;
import com.TLP.joblisting.repository.SearchRepository;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    private PostRepository repo;
    @Autowired
    private SearchRepository srepo;

    @Hidden
    @RequestMapping("/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui/index.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }

    // Ex: /posts/java
    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return srepo.findBytext(text);
    }
}