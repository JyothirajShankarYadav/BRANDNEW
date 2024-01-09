package com.orange.uitily;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectClass 
{
  public static void select(WebElement element,Object value)
  {
	 Select select = objects.select(element);
	 if(value instanceof Integer)
	 { 
		 select.selectByIndex((Integer)value);
	 }
	 else if(value instanceof String)
	 {
		 try
		 {
			 select.selectByValue((String)value);
		 }
		 catch(Exception e)
		 {
			 select.selectByVisibleText((String)value);
		 }
	 }
  }
  public static void deselect(WebElement element,Object value)
  {
	  Select select = objects.select(element);
	  if(value instanceof Integer)
		 { 
			 select.deselectByIndex((Integer)value);
		 }
		 else if(value instanceof String)
		 {
			 try
			 {
				 select.deselectByValue((String)value);
			 }
			 catch(Exception e)
			 {
				 select.deselectByVisibleText((String)value);
			 }
		 }
  }
  public static List<WebElement> options(WebElement element)
  {
	  Select select = objects.select(element);
	 return select.getOptions();
  }
  public static void deselectAll(WebElement element)
  {
	  Select select = objects.select(element);
	  select.deselectAll();
  }
  
}
