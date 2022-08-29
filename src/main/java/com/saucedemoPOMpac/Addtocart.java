package com.saucedemoPOMpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
private WebDriver driver;

	//obect create 
	
	public Addtocart(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addtocart;
	
	public void addtocartbutton()
	{
		addtocart.click();
	}
	public void verifiyaddtocart()
	{
		String expectedtitle = "Swag Labs";
		
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		if(expectedtitle.equals(actualtitle))
		{
	System.out.println("test case pass & verifi title");
		}
		else
		{
			System.out.println("test case failed");
		}
	}
	
	
	
	
	
	
	
}
