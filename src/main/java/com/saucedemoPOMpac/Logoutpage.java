package com.saucedemoPOMpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
 WebDriver driver;      // obect creation
	
	// create a constructor of class
 public Logoutpage(WebDriver d)
 {
	 driver = d;
	 PageFactory.initElements(driver, this);
 }

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
