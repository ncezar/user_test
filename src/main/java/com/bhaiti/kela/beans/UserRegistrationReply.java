package com.bhaiti.kela.beans;

public class UserRegistrationReply {
	String email;
	String password;
	String status;
	
    public String getEmail() {
    	return email;
    }
    
    public String getStatus() {
    	return status;
    }
    
    public void setStatus(String status) {
    	this.status= status;
    }
	
	public void setEmail(String email) {
		this.email= email;
	}
	
	public void setPass(String password) {
		this.password= password;
		
	}
	
}
