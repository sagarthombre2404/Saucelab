package com.saucedemoPOMpac;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage {
private WebDriver driver;

// create constructor
	public Homepage(WebDriver d)
		{
		 driver = d;
			PageFactory.initElements(driver, this);
		}
	
		@FindBy(id="react-burger-menu-btn")
		private WebElement clickmenubutton;
		
		
		 @FindBy(id="logout_sidebar_link")
		 private WebElement logoutbutton;
		 
		
		public void clickmenu()
		{
		clickmenubutton.click();
		}
		
		public void verifiyclickmenu()

		{
			String expectedurl = "https://www.saucedemo.com/inventory.html";
			
			String actualurl = driver.getCurrentUrl();
		if(expectedurl.equals(actualurl))
		{
			System.out.println("test case pass");
			
		}
		else
		{
			System.out.println("test case failed");
		}
		}

		//[perform action on webelement 
		 public void clicklogout()
		 {
			 logoutbutton.click();
		 }
		 public void verifiylogout()
		 {
			 String expectedurl="https://www.saucedemo.com/";
			 String actualurl= driver.getCurrentUrl();
			 if(expectedurl.equals(actualurl))
			 {
				 System.out.println("logout functionality test cast pass");
			 }
			 else
			 {
				 System.out.println("logout test case failed");
			 }
		 }
		
		
}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	