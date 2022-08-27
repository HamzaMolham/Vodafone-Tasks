package BaseData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;


public class TestBases extends AbstractTestNGCucumberTests{
	
	
	public static WebDriver driver;
	public static Properties prob;
	public static Actions actions;
	public static WebDriverWait wait;
	
  public TestBases() throws IOException {
    prob = new Properties();
    FileInputStream fis = new FileInputStream("C:\\Users\\Toka\\Desktop\\Selenium\\Vodafone\\src\\test\\java\\Configurations\\config.properties");
    prob.load(fis);
}
  public void intialization(String URL, String browser) {
	  if (browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Toka\\Desktop\\Selenium\\Vodafone\\src\\test\\java\\drivers\\chromedriver.exe" );
			driver= new ChromeDriver();
	  }
	  else if (browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Toka\\Desktop\\Selenium\\Vodafone\\src\\test\\java\\drivers\\geckodriver.exe" );
			driver= new FirefoxDriver();
	  }
		  
			actions = new Actions(driver);
			wait = new WebDriverWait(driver,10);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		
		
  }
  @AfterSuite
  public void teardown() {
	  driver.quit();
  }
}
