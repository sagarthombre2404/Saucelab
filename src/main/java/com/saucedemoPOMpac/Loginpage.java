package com.saucedemoPOMpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// using page factory
public class Loginpage {

	private WebDriver driver; //obect creation 
	

public Loginpage(WebDriver d)// constructor create
{
	driver  =d;
	PageFactory.initElements(driver, this);// this method will initiate webelement
}
// identifiy webelement 
//identifiy password
@FindBy(id="user-name")// return the webelement find the webelemnt
private WebElement username;

@FindBy(id="password")
private WebElement password;

@FindBy(id="login-button")
private WebElement loginbutton;

public void sendusername() // perform operation on webelement

{
	username.sendKeys("standard_user");
	
}
public void sendpassword()
{
	password.sendKeys("secret_sauce");
}
public void clickloginbutton()
{
	loginbutton.click();
}
}