package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends Baseclass {

	@Test
	public void logintest() {
		
	LoginPage lp=new LoginPage(driver);
	
	lp.setusername(username);
  
	lp.setpassword(password);

	lp.login();

	
	System.out.println(driver.getTitle());
	}
}
