package com.orange.runner;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.orange.genric.LaunchAndClose;
import com.orange.pom.AdminPage;

public class runner1 extends LaunchAndClose
{
 @Test
 public void run() throws Exception
 {
	 Thread.sleep(2000);
	 AdminPage a=new AdminPage(driver);
	 a.adminbutton();
	 String title = driver.getTitle();
	 if(title.equals(""))
	 {
		 test.log(Status.PASS, "pass");
		 Thread.sleep(2000);
		 a.addbtn();
		 Thread.sleep(2000);
		 a.employeetf().sendKeys("Rakesh Chitradurga");
		 Thread.sleep(2000);
		 a.usertf().sendKeys("Durgada simha");
		 Thread.sleep(2000);
		 a.passwordtf().sendKeys("123456@Asw");
		 Thread.sleep(2000);
		 a.confirmpwdtf().sendKeys("123456@Asw");
		 Thread.sleep(2000);
		 a.savebutton();
		 Thread.sleep(2000);
	 }
	 else
	 {
		 test.log(Status.FAIL, "testcase fail");
		 test.addScreenCaptureFromBase64String(close(driver));
	 }
	 report.flush();
	 
 }
}
