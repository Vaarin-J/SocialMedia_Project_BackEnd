package com.Socialmedia.Socialmedia.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Socialmedia.Socialmedia.Entity.Comment;
import com.Socialmedia.Socialmedia.Repository.CommentRepo;

@Service
public class CommentService {
    
    @Autowired
    CommentRepo cRepo;

    @Autowired
    UserService service;

    public Comment postCommentToDB(Comment comment){
        return cRepo.save(comment);
    }

 

    public ArrayList<Comment> getAllComment(String postId){
            
        ArrayList<Comment> arr= cRepo.findAllByPostId(postId);

        for(int i=0; i<arr.size(); i++){
            Comment commentItem = arr.get(i);
            commentItem.setUserName(service.displayUserMetaData(commentItem.getUserId()).getUserName());
        }
        return arr;
    }
}


