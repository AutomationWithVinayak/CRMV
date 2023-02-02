package com.recruitcrmsnehal.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generic {


	public void threadWait(int a) {

		try {
			Thread.sleep(a);
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}



	}
	
	
	
	public Object getDynamicClick(String text) {
	
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]")).click();
		return getDynamicClick(text) ;
		
	}
	
	public String getDynamicText(String text) {
		
		WebDriver driver = new ChromeDriver();
		String textt=driver.findElement(By.xpath("//*[contains(text(),'"+text+"')]")).getText();
		return textt ;
		
	}
	
	
	
	
}