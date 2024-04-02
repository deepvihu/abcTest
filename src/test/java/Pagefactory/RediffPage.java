package Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffPage {
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"srchquery_tbox\"]")
	@CacheLookup
	WebElement searchfield;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/form/input[2]")
	@CacheLookup
	WebElement searchicon;
	
	public RediffPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void stext(String key)
	{
		searchfield.sendKeys(key);
	}
	
	public void sbtn()
	{
		searchicon.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div")
//	@CacheLookup
//	WebElement currentDate;
//	
//	@FindBy(xpath="//span[@aria-label = 'Next Month']")
//	@CacheLookup
//	WebElement arrowbtn;	
	
	
	
	
//	public void deptDate(String date) throws InterruptedException
//	{
//	  String deptDate[] = date.split("-");
//		
//		String y = deptDate[0];
//		String m = deptDate[1];
//		String d = deptDate[2];
//				
//		while(true)
//	    {
//		  Thread.sleep(5000);
//		  String dt = currentDate.getText();
//		
//		  String arr[] = dt.split(" ");
//
//		  String month = arr[0];
//		  String year = arr[1];
//		  
//		  if(month.equalsIgnoreCase(m) && year.equals(y)) 
//		  {
//			 break; 
//		  }
//		  else
//		  {	  	 
//			  arrowbtn.click();				 
//		  }		
//	    } }
	
	}
