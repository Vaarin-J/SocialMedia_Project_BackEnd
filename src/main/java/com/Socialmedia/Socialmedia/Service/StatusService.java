package com.Socialmedia.Socialmedia.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Socialmedia.Socialmedia.Entity.Status;
import com.Socialmedia.Socialmedia.Repository.StatusRepo;

@Service
public class StatusService {
    
    @Autowired
    StatusRepo sRepo;

    @Autowired
    UserService service;

    public Status submitDataIntoDB(Status status){
        return sRepo.save(status);
    }
    
    public ArrayList<Status> retrieveStatus(){

        ArrayList<Status> arr= sRepo.findAll();

        for(int i=0; i<arr.size(); i++){
            Status statusItem = arr.get(i);
            statusItem.setUserName(service.displayUserMetaData(statusItem.getUserId()).getUserName());
        }
        return arr;
    }
}
