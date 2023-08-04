package com.Socialmedia.Socialmedia.Entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Comment {
    
    @Id
    @GeneratedValue
    private int id; 

    private String commentId;
    
    private String userId;
    private String postId;
    private String userName;
    
    private Timestamp timeStamp;
    private String description;
    public Comment(int id, String commentId, String userId, String postId, Timestamp timeStamp, String description) {
        this.id = id;
        this.commentId = commentId;
        this.timeStamp = timeStamp;
        this.userId = userId;
        this.postId = postId;
        this.description = description;
    }
    public Comment() {
        super();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCommentId() {
        return commentId;
    }
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }
    public Timestamp getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPostId() {
        return postId;
    }
    public void setPostId(String postId) {
        this.postId = postId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
}
