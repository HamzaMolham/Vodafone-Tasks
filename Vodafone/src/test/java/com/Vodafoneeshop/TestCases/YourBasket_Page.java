package com.Vodafoneeshop.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseData.TestBases;

public class YourBasket_Page extends TestBases {
	@FindBy (xpath="//button[text()='Proceed to Checkout ']")
	WebElement ProceedToCheckout;

	public YourBasket_Page() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public Checkout_Page ClickonProceedtoCheckout() throws IOException {
		actions.moveToElement(ProceedToCheckout);
		ProceedToCheckout.click();
		return new Checkout_Page();
	}

}
