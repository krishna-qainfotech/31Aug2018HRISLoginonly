package com.qait.demo.keywords;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;

public class TimeSheetAction extends GetPage{
	
	WebDriver driver;
	
	public TimeSheetAction(WebDriver driver) {
		super(driver,"TimeSheet_MyProfile");
	}
	
	public void clickOnMyProfile()  {
		 isElementDisplayed("btn_ProfileName");
		 element("btn_ProfileName").click();
		 isElementDisplayed("btn_MyProfile");
		 element("btn_MyProfile").click();
	}
	
	public String getProfileName()  {
		logMessage("Get profile name : "+element("img_ProfileName").getText());
		return element("img_ProfileName").getText();
	}
	
	public String VerifyByEmployeeId() {
		String id = element("txt_Emp_Id").getText();
		return id;
	}
	public Boolean VerifyByPageTitle() {
		return "QAIT Resource Management Tool ".equals(getPageTitle());
	}
	public Boolean VerifyByPageHeader() {
		return isElementDisplayed("txt_TimeSheet");
	}
	public Boolean VerifyByProfileText() {
		return isElementDisplayed("btn_ProfileName");
	}
}
