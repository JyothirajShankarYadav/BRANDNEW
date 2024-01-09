package pom.demowebpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressElement 
{
@FindBy(xpath = "//a[text()='Log in']")                         private WebElement login;

@FindBy(id = "Email")
private WebElement email;

@FindBy(id = "Password")
private WebElement password;

@FindBy(xpath = "//input[@class='button-1 login-button']")
private WebElement loginbtn;
@FindBy(id = "FirstName")  private WebElement fntf;
@FindBy(id = "LastName")   private WebElement lntf;
@FindBy(id = "Email")      private WebElement etf;
@FindBy(id = "Password")   private WebElement ptf;
@FindBy(id = "ConfirmPassword")  private WebElement cptf;

public AddressElement(WebDriver d)
{
	PageFactory.initElements(d, this);
}
public WebElement login()
{
	return login;
}
public WebElement email()
{
	return email;
}
public WebElement  password()
{
	return password;
}
public WebElement  firstname()
{
	return fntf;
}
public WebElement  lastname()
{
	return lntf;
}
public WebElement  emailtf()
{
	return etf;
}
public WebElement  pass()
{
	return ptf;
}
public WebElement  conpass()
{
	return cptf;
}
public WebElement  loginbtn()
{
	return loginbtn;
}

}
