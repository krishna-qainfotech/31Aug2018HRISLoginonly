package com.qait.demo.keywords;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qait.automation.getpageobjects.GetPage;
import com.qait.automation.utils.YamlReader;

public class HrisLoginPageAction extends GetPage {
	
	WebDriver driver;
public HrisLoginPageAction(WebDriver driver) {
	super(driver, "homePage");
}


public void clickOnLoginPanel() {
	wait.waitForPageToLoadCompletely();
    isElementDisplayed("btn_login_container");
    element("btn_login_container").click();
    logMessage("Clicked On login container");
}

public void submitLoginCredential() {

    isElementDisplayed("txt_login");
    element("txt_login").clear();
    element("txt_login").sendKeys(YamlReader.getData("username_hris"));
    isElementDisplayed("txt_password");
    element("txt_password").clear();
    element("txt_password").sendKeys(YamlReader.getData("password_hris"));
    isElementDisplayed("btn_sign_in");
    element("btn_sign_in").click();	
}
public void submitBlankuserNameandpassword() {
	isElementDisplayed("txt_login");
	 element("txt_login").clear();
	 element("txt_login").sendKeys(YamlReader.getData("nousername_hris"));
	 isElementDisplayed("txt_password");
	 element("txt_password").clear();
	 element("txt_password").sendKeys(YamlReader.getData("nopassword_hris"));
     isElementDisplayed("btn_sign_in");
	 element("btn_sign_in").click();	
	 Assert.assertTrue(isElementDisplayed("alt_Boxuser"));  
}

public void submitInvalidUsernameAndBlankPassword() {
	isElementDisplayed("txt_login");
	 element("txt_login").clear();
	 element("txt_login").sendKeys(YamlReader.getData("incorrectUsername"));
	 isElementDisplayed("txt_password");
	 element("txt_password").clear();
	 element("txt_password").sendKeys(YamlReader.getData("nopassword_hris"));
    isElementDisplayed("btn_sign_in");
	 element("btn_sign_in").click();	
	 Assert.assertTrue(isElementDisplayed("alt_boxPass"));  
}
public void submitvalidUsernameAndInvalidPassword() {
	isElementDisplayed("txt_login");
	 element("txt_login").clear();
	 element("txt_login").sendKeys(YamlReader.getData("username_hris"));
	 isElementDisplayed("txt_password");
	 element("txt_password").clear();
	 element("txt_password").sendKeys(YamlReader.getData("incorrectPassword"));
     isElementDisplayed("btn_sign_in");
	 element("btn_sign_in").click();	
	 Assert.assertTrue(isElementDisplayed("txt_invalidUser"));  
	
}

public void submitNoUsernameAndvalidPassword() {
	isElementDisplayed("txt_login");
	 element("txt_login").clear();
	 element("txt_login").sendKeys(YamlReader.getData("nousername_hris"));
	 isElementDisplayed("txt_password");
	 element("txt_password").clear();
	 element("txt_password").sendKeys(YamlReader.getData("password_hris"));
    isElementDisplayed("btn_sign_in");
	 element("btn_sign_in").click();	
	 Assert.assertTrue(isElementDisplayed("alt_Boxuser"));  
}
}
