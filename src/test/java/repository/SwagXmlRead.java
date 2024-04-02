package repository;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagXmlRead {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		File file=new File("C:\\Users\\deedhole\\eclipse-workspace\\DemoMum\\src\\test\\java\\repository\\SwagLogin.xml");
		DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
		DocumentBuilder dbuild = dbf.newDocumentBuilder();
		Document doc= dbuild.parse(file);
		doc.getDocumentElement().normalize();
		
		NodeList nodelist=doc.getElementsByTagName("log");
		Node node=nodelist.item(1);
		
		if(node.getNodeType()==node.ELEMENT_NODE)
		{
			Element element=(Element)node;
			String uname=element.getElementsByTagName("username").item(0).getTextContent();
			String pwd=element.getElementsByTagName("password").item(0).getTextContent();
			
//			String un=nodelist.item(0).getTextContent();
//			String pw=nodelist.item(1).getTextContent();
			
			driver.findElement(By.id("user-name")).sendKeys(uname);
			Thread.sleep(1000);
			driver.findElement(By.id("password")).sendKeys(pwd);
			Thread.sleep(1000);
			driver.findElement(By.id("login-button")).click();
			
		}
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
