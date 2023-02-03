package com.recruitcrmsnehal.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.recruitcrmsnehal.base.Generic;

public class DashBordPage  extends Generic{
	
	String path =" C:\\Users\\hp elitebook\\Desktop\\pople.xlsx";
	Generic gn = new Generic();
	
	
	
	public DashBordPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	

	
	
	@FindBy(xpath="//i[@id=\"sTest-candidateIcon\"]") WebElement  candidateBtn;
	@FindBy(id="sTest-resumeParserBtn") WebElement resumeBtn;
	@FindBy(xpath ="//label[@class=\"upload control\"]//following::input[@type=\"file\"]") WebElement resumeParserUpload;
	@FindBy(xpath ="//h4[contains(text(),'Candidate Pipeline By Recruiter Assigned')]") WebElement candidatePipeline;
	//@FindBy(xpath="//div[@id=\"dashBoardJobWidget\"]//div[contains(@class,\"dropdown dropdown-menu-animation select-field select-dropdown is-icon-right is-a\")]//div[3]//div//a") WebElement appliedDropDown; 
	@FindBy(xpath="(//div[@id=\"sTest-sortByTaDropdownBtn\"])[4]//following::div[6]//a//span[2]") WebElement appiledBtn;
	By appliedDropDown =By.xpath("//div[@class=\"dropdown dropdown-menu-animation select-field select-dropdown is-icon-right is-active is-mobile-modal\"]//a");
	 
	
	
	
	public void  candidateResumeParserUpload() {
		
		candidateBtn.click(); log.info("click on CandidateBtn ");	
		gn.clickOnElement(resumeBtn); //resumeBtn.click();
		resumeParserUpload.sendKeys(path); log.info("FileUploadSuccesfully");
		
	}
	
	
	
	
	public void gettingStartTextIsPresenet() {
		
		gn.textIsDisplay("Getting Started");   log.info("text is Display ");
		
	}
	
	
	
	
	public void taskBottomScroll() {
		
		gn.scrollOnElement(candidatePipeline); log.info("Scroll On Element :- "+candidatePipeline);	
	}
	
	
	
	public void candidatePipelineByCompanyApplied() {
		
		gn.waitInSec(2);
		gn.scrollOnElement(appiledBtn);                    log.info("Scroll On element :- "+ appiledBtn);
		gn.waitInSec(2);
		appiledBtn.click();                                log.info("Click On element :- "+ appiledBtn);
		gn.waitInSec(2);
		gn.dropDowm(appliedDropDown, "Selected");          log.info("Element Selected:- "+ "Selected from :- "+ appliedDropDown);
		
		
	}

	
	

}
