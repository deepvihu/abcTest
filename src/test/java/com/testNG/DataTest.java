package com.testNG;

import org.testng.annotations.Test;

public class DataTest {

	@Test(groups="Regression")
	  public void log() {
		  System.out.println("log method");
	  }
	  
	  @Test(groups="retesting")
	  public void add() {
		  System.out.println("add method");
	  }
	  
	  @Test (groups= {"Regression","Test"})
	  public void search() {
		  System.out.println("Search method");
		  }

}
