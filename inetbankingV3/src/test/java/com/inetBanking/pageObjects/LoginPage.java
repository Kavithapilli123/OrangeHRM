package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver ldriver;

public LoginPage(WebDriver rdriver){
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	}
   @FindBy(name="uid") 
   WebElement txtusername;
   
   @FindBy(name="password")
   WebElement txtpassword;
   
   @FindBy(name="btnLogin")
   WebElement btnlogin;
   
public void setusername(String user) {
	txtusername.sendKeys(user);
}
public void setpassword(String pass) {
	txtpassword.sendKeys(pass);
}
public void login() {
	 btnlogin.click();
}
}
