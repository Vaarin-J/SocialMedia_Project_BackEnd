package com.Socialmedia.Socialmedia.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Socialmedia.Socialmedia.Entity.Comment;

@Repository
public interface CommentRepo extends CrudRepository<Comment,Integer> {
    Comment save(Comment comment);

    ArrayList<Comment> findAllByPostId(String postId);

}
