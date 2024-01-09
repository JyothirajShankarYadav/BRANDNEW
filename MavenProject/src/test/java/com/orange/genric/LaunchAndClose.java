package com.orange.genric;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.orange.pom.AdminPage;
import com.orange.pom.MainLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchAndClose implements constant
{
	public WebDriver driver;
	public ExtentTest test;
	public ExtentReports report;
	
	@BeforeSuite
	public void reports()
	{
		 report=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("./reports/defects.html");
		report.attachReporter(spark);
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("Dummy report");
		spark.config().setReportName("Orange hrm reports");
		 test = report.createTest("testcase ");
		
	}
  @BeforeClass
  public void launch() throws Exception
  {
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	  driver.get(url);
	  Thread.sleep(2000);
  }
  @BeforeMethod
  public void login()  throws Exception
  {
	  MainLoginPage m=new MainLoginPage(driver);
	  m.username();
	  Thread.sleep(2000);
	  m.password();
	  Thread.sleep(2000);
	  m.loginbutton();
	  Thread.sleep(2000);
  }
  @AfterTest
  public String close(WebDriver driver)throws Exception
  {
	  String path="./reports/defects.jpg";
	  TakesScreenshot t=(TakesScreenshot)driver;
	  File temp=t.getScreenshotAs(OutputType.FILE);
	 File dist = new File("./permanent/defects");
	 FileHandler.copy(temp, dist);
	 return "."+path;
	 // driver.close();
  }
}
