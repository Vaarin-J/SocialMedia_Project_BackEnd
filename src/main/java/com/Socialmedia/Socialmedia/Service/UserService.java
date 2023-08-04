package com.Socialmedia.Socialmedia.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Socialmedia.Socialmedia.Entity.Users;
import com.Socialmedia.Socialmedia.Repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	public Users submitMetaDataOfUser(Users user) {
		return userRepo.save(user);
	}
	
	public Users displayUserMetaData(String userid) {		
		return userRepo.findByUserId(userid);
	}
}