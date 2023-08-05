package com.Socialmedia.Socialmedia.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Socialmedia.Socialmedia.Entity.Users;
import com.Socialmedia.Socialmedia.Service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;


	@PostMapping("")
	private boolean submitUser(@RequestBody Users users) {
		 userService.submitMetaDataOfUser(users);
         return true;
	}
	
	@GetMapping("/{userid}")
	private Users getUserDetails(@PathVariable("userid") String userId) {
		return userService.displayUserMetaData(userId);
	}
}
