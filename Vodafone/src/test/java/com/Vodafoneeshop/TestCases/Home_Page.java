package com.Vodafoneeshop.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseData.TestBases;


public class Home_Page extends TestBases {
	@FindBy (xpath="//span[text()='English']")
	WebElement EnglishButton;
	
	@FindBy (xpath="//img[@src='https://eshop.vodafone.com.eg/eshopContent//product_images/original/applelogo.png']")
	WebElement Applelogo;
	
	@FindBy (xpath="//i[@aria-hidden='true']")
	WebElement Cookie;

	public Home_Page() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickonEnglishButton() {
		EnglishButton.click();
	}
	
	public void ClickonCookie() {
		Cookie.click();
	}
	
	public Apple_Page ClickonAppleLogo() throws IOException {
		actions.moveToElement(Applelogo);
		Applelogo.click();
		return new Apple_Page();
	}

}
