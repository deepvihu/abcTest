package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By uname=By.id("user-name");
	By password=By.xpath("//input[@placeholder=\"Password\"]");
	By logbtn=By.id("login-button");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeuser(String user)
	{
		driver.findElement(uname).sendKeys(user);
	}
	
	 public void typepass(String pass)
	 {
		 driver.findElement(password).sendKeys(pass);
	 }
	 
	 public void clicklog()
	 {
		 driver.findElement(logbtn).click();
	 }
}
