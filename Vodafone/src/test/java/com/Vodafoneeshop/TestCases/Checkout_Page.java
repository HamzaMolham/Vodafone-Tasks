package com.Vodafoneeshop.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseData.TestBases;

public class Checkout_Page extends TestBases {
	@FindBy (xpath="//html/body/app-root/app-checkout-page/div/div/div[3]/div/div/div/div[2]/div/select")
	WebElement City;
	
	@FindBy (xpath="//html/body/app-root/app-checkout-page/div/div/div[3]/div/div/div/div[2]/div[2]/select")
	WebElement District;
	
	@FindBy (xpath="//html/body/app-root/app-checkout-page/div/div/div[3]/div/div/div/div[3]/div/div[2]/div/div/div")
	WebElement Location;
	
	@FindBy (xpath="//input[@formcontrolname='address1']")
	WebElement Street;
	
	@FindBy (xpath="//input[@formcontrolname='buildingNumber']")
	WebElement Building;
	
	@FindBy (xpath="//input[@formcontrolname='floorNumber']")
	WebElement Floor;
	
	@FindBy (xpath="//input[@formcontrolname='appartmentNumber']")
	WebElement Appartment;
	
	@FindBy (xpath="//html/body/app-root/app-checkout-page/div/div/div[3]/div/div/div/div[3]/div/div[2]/div[2]/form/div[3]/button")
	WebElement Continue;
	
	@FindBy (id="shippingAddressContinue")
	WebElement ShippingAddressContinue;
	
	@FindBy (xpath="//div[text()=' Please enter a valid name']")
	WebElement Fullname;
	

	public Checkout_Page() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	public void CityDropDownMenu() {
		
		Select city = new Select(City);
		city.selectByVisibleText("Cairo");
	}
	
public void DistrictDropDownMenu() {
		
		Select district = new Select(District);
		district.selectByVisibleText("Ain Shams");
	}

public void ClickonLocationButton() {
	actions.moveToElement(Location);
	Location.click();
}

    public void FillShippingData() {
    	Street.sendKeys("Louran abukeer carpet city");
    	Building.sendKeys("1");
    	Floor.sendKeys("13");
    	Appartment.sendKeys("2");
    	Continue.click();
    }
    
    public void ClickonContinueShippingAddress() {
    	ShippingAddressContinue.click();
    }
    
    public boolean IsErrorMsgDisplayed() {
    	boolean isErrorMsgDisplayed = Fullname.isDisplayed();
    	return isErrorMsgDisplayed;
    }
}
