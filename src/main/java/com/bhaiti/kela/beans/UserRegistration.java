package com.bhaiti.kela.beans;

import java.util.ArrayList;
import java.util.List;

public class UserRegistration{
	
    private List<User> UserRecords;

    private static UserRegistration user = null;

    private UserRegistration(){

    UserRecords = new ArrayList<User>();

    }

    public static UserRegistration getInstance() {

        if(user == null) {
              user = new UserRegistration();
              return user;
            }else {
                return user;

            }

    }

    public void add(User user) {
    	UserRecords.add(user);
    }

	public String updateUser(User user) {
	
		for(int i=0; i<UserRecords.size(); i++){
		
            User usr = UserRecords.get(i);

            if(user.getEmail().equals(usr.getEmail())) {		
              UserRecords.set(i, user);//update the new record		
              return "Update successful";

            }

        }
		
		return "Update failed";
	
	}

//	public String deleteUser(String registrationNumber) {
//	
//		for(int i=0; i<UserRecords.size(); i++)
//		
//		        {
//		
//		            User stdn = UserRecords.get(i);
//		
//		            if(stdn.getRegistrationNumber().equals(registrationNumber)){
//		
//		              UserRecords.remove(i);//update the new record
//		
//		              return "Delete successful";
//		
//		            }
//		
//		        }
//		
//		return "Delete un-successful";
//	
//	}
	
    public List<User> getUserRecords() {
    	return UserRecords;
    }


}
