package com.MSRL.MySuccessRealLife.Service;

import org.springframework.stereotype.Service;

import com.MSRL.MySuccessRealLife.constant.UserConstant;


@Service

public class MsrlSignInService 
{
	
	UserConstant user= new UserConstant();
	private String name = null;
	
	public String validateSignIn(String msrlId, String password) {
		if(msrlId.equals(user.msrlId)) {
			
			name = user.userName;
		}
		
		if(null != name) {
			return name;
		}
		else 
		return "Please provide a valid user id";
		
	}
	

}
