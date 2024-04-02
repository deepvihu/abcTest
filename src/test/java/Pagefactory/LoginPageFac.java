package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFac {
WebDriver driver;

@FindBy(xpath="//input[@placeholder=\"Username\"]") 
@CacheLookup
WebElement username;

//@FindBy(how=How.ID,using="password")
//@CacheLookup
//WebElement passwd;

//@FindBys({
//	@FindBy(id="password"),   // or
//	@FindBy(name="password")})
//WebElement password;

@FindAll({
	@FindBy(id="password"),  
	@FindBy(name="password"),
	@FindBy(xpath="//input[@type=\"password\"]")
})
WebElement passd;

@FindBy(id="login-button")
WebElement logbtn;
	
public LoginPageFac(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void launchapp()
{
	driver.get("");
}
public void typedata(String uname,String pwd)
{
	username.sendKeys(uname);
	passd.sendKeys(pwd);
}

public void typeuser(String user)
{
	username.sendKeys(user);
}

public void typepass(String pass)
{
	passd.sendKeys(pass);
}



public void clickLogin()
{
	logbtn.click();
}
}
