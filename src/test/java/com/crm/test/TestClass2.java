package com.crm.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.recruitcrmsnehal.base.Generic;
import com.recruitcrmsnehal.base.TestBase;
import com.recruitcrmsnehal.pages.DashBordPage;
import com.recruitcrmsnehal.pages.LoginPage;

public class TestClass2 extends TestBase{

	DashBordPage db = new DashBordPage();
	Generic gn = new Generic();
	LoginPage lp = new LoginPage();
	
	public TestClass2() throws IOException {
		super();
		
	}

	
	
	
	@BeforeMethod
	public void setupStart() {
		
		setup();
	}
	
	
	
	@Test
	public void ImportCandidatesFileUpload() throws IOException {
		
		lp = new LoginPage();
		db = new DashBordPage();

		lp.loginthepage(pro.getProperty("Email"), pro.getProperty("Password"));
		db.gettingStartTextIsPresenet();
		gn.waitInSec(3);
		db.candidateResumeParserUpload();
	}
	
	@AfterMethod
	public void tearDown() {
		
		gn.waitInSec(3);
		driver.quit();
	}
	
	
}
