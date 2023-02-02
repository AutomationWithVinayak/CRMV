package com.recruitcrmsnehal.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.recruitcrmsnehal.pages.LoginPage;
import com.recruitcrmsnehal.util.Util;

public class TestBase {

	
	
	public static final Logger log = LogManager.getLogger(LoginPage.class);
	
	public static WebDriver  driver ;
	public static Properties pro;
	
	public TestBase() throws IOException{
		
		FileInputStream file = new FileInputStream ("D:\\eclipseworkplace\\Appium_WorkPlace\\CRMSnehal\\src\\main\\java\\com\\recruitcrmsnehal\\config\\Properties.text");
		
		 pro = new Properties();
		 pro.load(file);
	
	}
	
	
	
	
	@SuppressWarnings("deprecation")
	public static void setup() {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disabled-notifications");
		
		driver = new ChromeDriver();
		driver.get(pro.getProperty("Url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Util.IMPLICITLY_WAIT,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Util.PAGE_LOAD,TimeUnit.SECONDS);
		log.info("Browser Lunch Successfully");
		
	}
	
	
	
	
	
	
	
	
}
