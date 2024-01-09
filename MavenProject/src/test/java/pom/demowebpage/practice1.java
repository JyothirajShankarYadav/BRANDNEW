package pom.demowebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice1 
{
  @Test(dataProvider = "excel",dataProviderClass = datafromexcel.class)
  public void test(String fn,String ln,String email,String pass,String conpass) throws Exception
  {
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://demowebshop.tricentis.com/register");
	  Thread.sleep(5000);
	  driver.findElement(By.id("gender-male")).click();
	  Thread.sleep(2000);
	  AddressElement a=new AddressElement(driver);
	  a.firstname().sendKeys(fn);
	  Thread.sleep(1000);
	  a.lastname().sendKeys(ln);
	  Thread.sleep(1000);
	  a.emailtf().sendKeys(email);
	  Thread.sleep(1000);
	  a.pass().sendKeys(pass);
	  Thread.sleep(1000);
	  a.conpass().sendKeys(conpass);
	  
	  
  }
}
