package com.crm.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.recruitcrmsnehal.base.Generic;
import com.recruitcrmsnehal.base.TestBase;

public class TestClass5 extends TestBase{

	public TestClass5() throws IOException {
		super();
	}
	
	Generic gn = new Generic();
	
	@Test
	public void logTrial() {
		
		gn.logMessage("message  trail");
		
	}
	
	

}
