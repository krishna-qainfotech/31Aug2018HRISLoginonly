package com.qait.demo.keywords;

import org.openqa.selenium.WebDriver;

import com.qait.automation.getpageobjects.GetPage;

public class PersonalDetailAction extends GetPage{
	WebDriver driver;
	public PersonalDetailAction(WebDriver driver) {
		super(driver,"PersonalDetails");
	}
	
	public String getFirstName() {
		//isElementDisplayed("FirstName");
		String firstname = element("txt_FirstName").getText();
		System.out.println(firstname);
		return  firstname;
	}
}
