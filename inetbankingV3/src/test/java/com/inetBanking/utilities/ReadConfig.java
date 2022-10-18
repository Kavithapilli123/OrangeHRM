 package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
public ReadConfig(){
	File src=new File("./Configuration/config.properties");	
	try {
		FileInputStream fis=new FileInputStream(src);
	  pro=new Properties();
	  pro.load(fis);
	}
	catch(Exception e){
		System.out.println("Exception is"+e.getMessage());
		}
	}
	public String getApplicationUrl() {
	String url=	pro.getProperty("baseURL");
		return url;
	}
	public String getuser() {
		String Username=pro.getProperty("username");
		return Username;
	}
	public String getpassword() {
		String pwd=pro.getProperty("password");
	  return pwd;
	}
	public String getChromepath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getFirefoxpath() {
		String firefoxpath=pro.getProperty("firefoxpath");
	   return firefoxpath;
	}
	public String getiepath() {
		String iepath=pro.getProperty("iepath");
	    return iepath;
	}
}
