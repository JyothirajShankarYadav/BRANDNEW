package com.orange.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainLoginPage 
{
 @FindBy(name = "username")                              private WebElement usernametf;
 @FindBy(name = "password")                              private WebElement passwordtf;
 @FindBy(xpath = "//button[text()=' Login ']")           private WebElement loginbtn;
 @FindBy(xpath = "//p[text()='Forgot your password? ']") private WebElement forgotpssdlink;
 
 
 public MainLoginPage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 public void username()
 {
	 usernametf.sendKeys("Admin");
 }
 
 public void password()
 {
	 passwordtf.sendKeys("admin123");
 }
 public void loginbutton()
 {
	 loginbtn.click(); 
 }
 
 public void forgotpsd()
 {
	 forgotpssdlink.click(); 
 }
 
}
