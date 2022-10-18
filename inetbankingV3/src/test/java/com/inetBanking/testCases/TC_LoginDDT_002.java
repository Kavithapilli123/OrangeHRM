package com.inetBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends Baseclass{
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user ,String pwd) {
		LoginPage lp=new LoginPage(driver);
		lp.setusername(user);
		lp.setpassword(pwd);
		lp.login();
		
		Assert.assertTrue(isAlertPresent());
	}
	
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
			}
		catch(NoAlertPresentException e){
			
			return false;
			
		}
	}
	@DataProvider(name="LoginData")
  String[][] getData() throws IOException{
	 String path="C:\\New folder\\Screenshot\\LoginData.xlsx" ;
	  
	 int rownum=XLUtils.getRowCount(path, "Sheet1");
   int colcount=XLUtils.getCellCount(path, "Sheet1",1);
	
   String logindata[][]=new String [rownum][colcount];
   for(int i=1;i<=rownum;i++) {
	   
	   for(int j=0;j<colcount;j++) {
		   logindata[i-1][j]= XLUtils.getCellData(path, "sheet1", i, j);
		    }
   }
	
   return logindata;
	}
}
