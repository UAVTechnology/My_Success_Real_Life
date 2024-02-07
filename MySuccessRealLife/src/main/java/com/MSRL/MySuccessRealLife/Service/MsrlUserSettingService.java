package com.MSRL.MySuccessRealLife.Service;

import org.springframework.stereotype.Service;
import com.MSRL.MySuccessRealLife.constant.UserConstant;

@Service

public class MsrlUserSettingService {
	
	UserConstant user = new UserConstant();
	
	private String name;
	private String email;
	private String password;
	private String mobile_no;
	private String aadhaar_no;
	private String pan_no;
	private String address;
	
	public String update() {
		
		name=user.userName;
		return name;
	}

}
