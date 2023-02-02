package com.crm.test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.*;
import com.recruitcrmsnehal.base.Generic;
import com.recruitcrmsnehal.base.TestBase;
import com.recruitcrmsnehal.pages.LoginPage;


@Listeners(com.crm.test.Listnerss.class)
public class TestClass extends TestBase {

	
	public TestClass() throws IOException {
		super();
		
	}
	
	
	LoginPage  lp = new  LoginPage();
	Generic gn =new Generic();
	
	
	@BeforeMethod
	public void setupStart() {
		
		setup(); log.info("Step : 1 browser lunched ");
		
	}
	
	
	@Test
	public void loginEnter() throws IOException {
	    lp = new LoginPage();
		lp.verifyUrl(pro.getProperty("Url"));
		lp.loginthepage(pro.getProperty("Email"), pro.getProperty("Password"));
		lp.fistPageTitleVerify(pro.getProperty("title"));
		
	}
	
	
	
	@AfterClass
	public void tearDown() {
		
		gn.threadWait(3000);
		driver.quit();
	}
	
	
	

}
