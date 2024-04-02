package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
WebDriver driver;
LoginPage log;
	@Test
	public void verifytest()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		log=new LoginPage(driver);
		log.typeuser("standard_user");
		log.typepass("secret_sauce");
		log.clicklog();
	}
}
