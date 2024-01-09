package com.orange.uitily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class actionsClass 
{
  public static void moveToElement(WebDriver driver,WebElement target)
  {
	  objects.actions(driver).moveToElement(target).click().perform();
  }
  public static void dragAnddrop(WebDriver driver,WebElement element,WebElement target )
  {
	  objects.actions(driver).dragAndDrop(element, target).perform();
  }
  public static void rightClick(WebDriver driver,WebElement target)
  {
	  objects.actions(driver).contextClick(target).perform();
  }
  public static void clickAndHold(WebDriver driver,WebElement target)
  {
	  objects.actions(driver).clickAndHold(target).perform();
  }
  public static void doubleClick(WebDriver driver,WebElement target)
  {
	  objects.actions(driver).doubleClick(target).perform();
  }
}
