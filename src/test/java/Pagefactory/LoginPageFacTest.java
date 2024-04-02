package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageFacTest {
WebDriver driver;
LoginPageFac lp;

@Test
public void testLog()
{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	
	lp=new LoginPageFac(driver);
	lp.typedata("standard_user", "secret_sauce");
	lp.clickLogin();
	
}
	
	
}
