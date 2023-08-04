package com.Socialmedia.Socialmedia.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Socialmedia.Socialmedia.Entity.Comment;
import com.Socialmedia.Socialmedia.Service.CommentService;

@CrossOrigin 
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    CommentService service;

    @PostMapping("")
    private Comment postComment(@RequestBody Comment comment){
        return service.postCommentToDB(comment);
    }

    @GetMapping("/{postId}")
    private ArrayList<Comment> getAllComments(@PathVariable("postId") String postId){
        return service.getAllComment(postId);
    }
    
}
