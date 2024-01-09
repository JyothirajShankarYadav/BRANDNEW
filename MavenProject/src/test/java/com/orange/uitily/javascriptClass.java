package com.orange.uitily;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javascriptClass 
{
  public static void disable(WebDriver driver,WebElement element,String value)
  {
	 objects.javascript(driver).executeScript("arguments[0].value='"+value+"';",element); 
  }
  public static void scrollView(WebDriver driver,WebElement element)
  {
	  objects.javascript(driver).executeScript("arguments[0].scrollIntoView();", element);
  }
  public static void scrollElement(WebDriver driver,WebElement element,int x,int y)
  {
	  objects.javascript(driver).executeScript("windows.scrollBy("+x+","+y+")");
  }
}
