package com.Vodafoneeshop.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BaseData.TestBases;

public class Apple_Page extends TestBases {
	@FindBy (xpath="//img[@src='https://eshop.vodafone.com.eg/eshopContent//product_images/carousel/iPhone13_green_carousel.png']")
	WebElement iphone13;

	public Apple_Page() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public YourBasket_Page ClickonIphone13() throws IOException {
		actions.moveToElement(iphone13);
		wait.until(ExpectedConditions.elementToBeClickable(iphone13));
		iphone13.click();
		return new YourBasket_Page();
	}

}
