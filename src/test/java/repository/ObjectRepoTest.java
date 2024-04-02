package repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ObjectRepoTest {
	
@Test
	public void testswag() throws IOException, InterruptedException
	{
	File file=new File("C:\\Users\\deedhole\\eclipse-workspace\\DemoMum\\src\\test\\java\\repository\\swag.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties pro= new Properties();
		pro.load(fis);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(pro.getProperty("unameXpath"))).
		sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id(pro.getProperty("passid"))).
		sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id(pro.getProperty("logbtnid"))).click();
		
		driver.close();
		
	}
	
	
}
