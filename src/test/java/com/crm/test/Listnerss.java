package com.crm.test;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.recruitcrmsnehal.base.TestBase;

import net.bytebuddy.utility.RandomString;

public class Listnerss extends TestBase implements  ITestListener  {


	public Listnerss() throws IOException {
		super();

	}



	public void onTestStart(ITestResult result) {

		log.info("Execution start");

	}



	public void onTestSuccess(ITestResult result) {

		log.info("Test case Passed :- "+ result.getName());
	}




	public void onTestFailure(ITestResult result) {

		WebDriver driver =  new ChromeDriver();
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Rname =RandomString.make(4);
		File fl = new File ("D:\\eclipseworkplace\\CRM\\CRMSnehal\\FailedTCScreenshot\\"+result.getName()+Rname+".png");
        try {
        	
			FileHandler.copy(source, fl);
			
		} catch (IOException e) {
			e.printStackTrace();
		}


		log.info("Test case Failed :- "+ result.getName());





	}



	public void onTestSkipped(ITestResult result) {

		log.info("Test case Skipped :- "+ result.getName());


	}



	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {



	}

	public void onTestFailedWithTimeout(ITestResult result) {

		log.info("Test case FailedWithTimeOut :- "+ result.getName());

	}


	public void onStart(ITestContext context) {



	}

	public void onFinish(ITestContext context) {

		log.info(""
				+ "------------------------------------"+'\n'
				+ "------------------------------------"+'\n'
				+ "------------------------------------"+'\n'
				+ "------------------------------------"+'\n'
				+ "--------Execution_Completed---------"+'\n'
				+ "------------------------------------"+'\n'
				+ "------------------------------------"+'\n'
				+ "-------------C--R--M----------------"+'\n'
				+ "------------------------------------"+'\n'
				+ "----------------*-------------------"+'\n'
				+ "------------------------------------"+'\n'
				+ "------------------------------------"+'\n'
				+"------------------------------------"+'\n'
				+"------------------------------------");

	}






}
