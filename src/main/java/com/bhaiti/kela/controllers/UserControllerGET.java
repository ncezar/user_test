package com.bhaiti.kela.controllers;


import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.bhaiti.kela.beans.User;
import com.bhaiti.kela.beans.UserRegistration;


public class UserControllerGET {
	  @RequestMapping(method = RequestMethod.GET, value="/user/allusers")

	  @ResponseBody

	  public List<User> getAllUsers() {
		  return UserRegistration.getInstance().getUserRecords();
	  }
}
