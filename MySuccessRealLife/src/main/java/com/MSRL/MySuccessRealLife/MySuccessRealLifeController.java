package com.MSRL.MySuccessRealLife;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.MSRL.MySuccessRealLife.Service.MsrlSignInService;
import com.MSRL.MySuccessRealLife.Service.MsrlSignUpService;
import com.MSRL.MySuccessRealLife.Service.MsrlUserService;
import com.MSRL.MySuccessRealLife.Service.MsrlUserSettingService;

@RestController


public class MySuccessRealLifeController {
	@Autowired
	
	MsrlSignUpService signUpService= new MsrlSignUpService();
	MsrlSignInService msrlService = new MsrlSignInService();
	
	@GetMapping("/signUp/{sponser_id}")
	public MsrlSignUpService signUpDetails(String sponsor_id, String name, String email, String password, String mobile_no, String aadhaar_no, String pan_no, String address)
	{
		return signUpService;
				//new MsrlSignUpService(sponsor_id="123", name="Utsav", email="utsav@gmail.com", password= "123", mobile_no="1234567891", aadhaar_no="1236547554", address="dehradun");
	}
	
	@PostMapping("/signUp")
	
	public String signUp(@RequestBody MsrlSignUpService signUpService )
	{
		this.signUpService=signUpService;
		return "SignUp successfull";
	}
	
	
	@GetMapping("/signIn/{id}/{password}")
	@ResponseBody
	    public String signIn(@PathVariable String id,@PathVariable String password) {
	        
		 if(null!=id)System.out.println("hi"+id);
		 String msg = msrlService.validateSignIn(id,password);
		 System.out.println("msg");
	        return msg; 
	    }
	
	
	
	MsrlUserService user = new MsrlUserService();
	
	@GetMapping("/User")
	@ResponseBody
		public MsrlUserService userDetails(String sponsor_id, String name, String tair, String reward) {
		
		return user;
	}
	
	
	MsrlUserSettingService userSetting = new MsrlUserSettingService();
	
	@PutMapping("/update")
	
	 	public MsrlUserSettingService setting() {
		
		return userSetting;
		
	}
}
