package com.MSRL.MySuccessRealLife.Service;

import org.springframework.stereotype.Service;

import com.MSRL.MySuccessRealLife.constant.UserConstant;


@Service

public class MsrlUserService {
	
	UserConstant user = new UserConstant();

	private String sponsor_id = null;
	private String name = null;
	private String tair = null;
	private String reward = null;
	
	public String Show() {
		
		sponsor_id = user.msrlId;
		name = user.userName;
		tair = user.tair;
		reward = user.reward;
		
		return sponsor_id;
		
	}
	
	

}
