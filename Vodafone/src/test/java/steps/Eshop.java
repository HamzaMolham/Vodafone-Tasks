package steps;

import java.io.IOException;

import org.junit.Assert;
import com.Vodafoneeshop.TestCases.Apple_Page;
import com.Vodafoneeshop.TestCases.Checkout_Page;
import com.Vodafoneeshop.TestCases.Home_Page;
import com.Vodafoneeshop.TestCases.Iphone13_Page;
import com.Vodafoneeshop.TestCases.YourBasket_Page;

import BaseData.TestBases;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Eshop extends TestBases {
	Home_Page home;
	Apple_Page apple;
	Iphone13_Page iphone;
	YourBasket_Page basket;
	Checkout_Page checkout;

	public Eshop() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Given ("I will open the URL of vodafone eshop")
	public void OpenTheURLHomePage() {
		intialization(prob.getProperty("URL"),prob.getProperty("browser"));
	}
	
	@When ("I click on the English button")
	public void ClickonEnglishButton() throws IOException {
		home = new Home_Page();
		home.ClickonEnglishButton();
		home.ClickonCookie();
	}
	
	@And ("I click on the Apple logo")
	public void ClickonAppleLogo() throws IOException {
		home = new Home_Page();
		home.ClickonAppleLogo();
	}
		
	@And ("I click on the iphone13 product")
	public void ClickonIphone13() throws IOException {
		apple = new Apple_Page();
		apple.ClickonIphone13();
	}
	
	@And ("I click on the Add to basket button")
	public void ClickonAddtoBasketButton() throws IOException {
		iphone = new Iphone13_Page();
		iphone.ClickonAddtoBasket();
	}
	
	@And ("I click on the proceed to checkout button")
	public void ClickonProceedToCheckout() throws IOException {
		basket = new YourBasket_Page();
		basket.ClickonProceedtoCheckout();
	}
	
	@And ("I fill the city and district and click on the deliever to my location button")
	public void FilltheCityandDistrict() throws IOException {
		checkout = new Checkout_Page();
		checkout.CityDropDownMenu();
		checkout.DistrictDropDownMenu();
		checkout.ClickonLocationButton();
	}
	
	@And ("I fill the address, building, floor and appartment data and click on continue")
	public void FilltheAddressData() throws IOException {
		checkout = new Checkout_Page();
		checkout.FillShippingData();
	}
	
	@And ("I click on continue shipping address button without filling the personal data")
	public void ClickonShippingAddressContinue() throws IOException {
		checkout = new Checkout_Page();
		checkout.ClickonContinueShippingAddress();
	}
	@Then ("I find an error stating to fill the fullname data")
	public void ValidatTheErrorMsg() throws IOException {
		checkout = new Checkout_Page();
		boolean actualresults = checkout.IsErrorMsgDisplayed();
		Assert.assertTrue(actualresults);
		
	}

}
