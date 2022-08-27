package com.Vodafoneeshop.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BaseData.TestBases;

public class Iphone13_Page extends TestBases {
	
	@FindBy (xpath="//button[text()='Add to basket']")
	WebElement AddtoBasket;

	public Iphone13_Page() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public YourBasket_Page ClickonAddtoBasket() throws IOException {
		actions.moveToElement(AddtoBasket);
		wait.until(ExpectedConditions.elementToBeClickable(AddtoBasket));
		AddtoBasket.click();
		return new YourBasket_Page();
	}

}
