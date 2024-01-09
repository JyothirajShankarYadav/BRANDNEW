package com.orange.uitily;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class objects 
{
  public static Select select(WebElement element)
  {
	  Select sel=new Select(element);
	  return sel;
  }
  public static Actions actions(WebDriver driver)
  {
	  Actions act=new Actions(driver);
	  return act;
  }
  public static JavascriptExecutor javascript(WebDriver driver)
  {
	  JavascriptExecutor jss=(JavascriptExecutor)driver;
	  return jss;
  }
}
