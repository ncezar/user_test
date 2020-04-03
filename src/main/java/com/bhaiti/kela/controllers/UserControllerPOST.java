package com.bhaiti.kela.controllers;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhaiti.kela.beans.User;
import com.bhaiti.kela.beans.UserRegistration;
import com.bhaiti.kela.beans.UserRegistrationReply;


public class UserControllerPOST {
	  @RequestMapping(method = RequestMethod.POST, value="/register/user")

	  @ResponseBody
	  public UserRegistrationReply registerUser(@RequestBody User user) {

			System.out.println("In registerUser");	
	        UserRegistrationReply usereply= new UserRegistrationReply();      
	        UserRegistration.getInstance().add(user);
	
	
	        usereply.setEmail(user.getEmail());	
	        usereply.setPass(user.getPass());    
	        usereply.setStatus("Successful");
	        
	        return usereply;

		}
}
