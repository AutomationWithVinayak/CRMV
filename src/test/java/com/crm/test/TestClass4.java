package com.crm.test;

import java.io.IOException;
import org.testng.annotations.*;
import com.recruitcrmsnehal.base.Generic;
import com.recruitcrmsnehal.base.TestBase;
import com.recruitcrmsnehal.pages.DashBordPage;
import com.recruitcrmsnehal.pages.LoginPage;

public class TestClass4 extends TestBase{

	public TestClass4() throws IOException {
		super();
	}
	
	Generic gn = new Generic();
	DashBordPage db = new DashBordPage();
	LoginPage lp = new LoginPage();
	
	
	
	
	@BeforeMethod
	public void setUpStart() {
		
		setup();
		
	}
	
	
	@Test
	public void appliedDropDownSelect() throws IOException {
		lp = new LoginPage();
		db = new DashBordPage();
		lp.loginthepage(pro.getProperty("Email"), pro.getProperty("Password"));
		db.candidatePipelineByCompanyApplied();	
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		gn.waitInSec(5);
		driver.quit();
	}
	

}
