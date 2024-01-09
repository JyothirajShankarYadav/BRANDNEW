package com.orange.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage 
{
  @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") 
  private WebElement addbtn;
  @FindBy(xpath = "(//input)[2]")    private WebElement employeNametf;
  @FindBy(xpath = "(//input)[3]")     private WebElement userNametf;
  @FindBy(xpath = "(//input)[4]")     private WebElement passtf;
  @FindBy(xpath = "(//input)[5]")     private WebElement confirmPasstf;
  @FindBy(xpath = "//button[text()=' Save ']")  private WebElement savebtn;
  @FindBy(xpath = "//button[text()=' Cancel ']")  private WebElement cancelbtn;
  @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
  private WebElement userRoledd;
  @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
  private WebElement statusdd;
  @FindBy(xpath = "//span[text()='Admin']")  private WebElement adminbtn;
  
  public AdminPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  public void addbtn()
  {
	  addbtn.click(); 
  }
  public WebElement employeetf ()
  {
	  return employeNametf ;
  }
  public WebElement usertf ()
  {
	  return userNametf ;
  }
  public WebElement passwordtf ()
  {
	  return passtf ;
  }
  public WebElement confirmpwdtf ()
  {
	  return confirmPasstf ;
  }
  public void savebutton ()
  {
	  savebtn.click(); ;
  }
  public void cancelbutton()
  {
	  cancelbtn.click(); ;
  }
  public void adminbutton()
  {
	  adminbtn.click(); ;
  }
}
