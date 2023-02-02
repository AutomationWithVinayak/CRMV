package com.crm.test;


import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.recruitcrmsnehal.base.Generic;
import com.recruitcrmsnehal.base.TestBase;
import com.recruitcrmsnehal.pages.DashBordPage;
import com.recruitcrmsnehal.pages.LoginPage;

public class TestClass3 extends TestBase{

	public TestClass3() throws IOException {
		super();
	}
	
	DashBordPage db = new DashBordPage();
    Generic gn = new Generic();
    LoginPage lp = new LoginPage();
	
	
	
	
	@BeforeMethod
	public void setupStart() {
		
		setup();
		
	}
	
	
	
	
	
	
	
	
	@Test
	public void scrollOnBottom() throws IOException {
		lp = new LoginPage();
		 gn = new Generic();
	    db = new DashBordPage();
		lp.loginthepage(pro.getProperty("Email"),pro.getProperty("Password"));
		gn.waitInSec(2);
		db.taskBottomScroll();
		gn.waitInSec(10);
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		gn.waitInSec(5);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
