package firsttestngpackage;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
public class FirstTestNGFile {
	
	    public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "C:/Mala java and selenium class/gecko 18/geckodriver/geckodriver.exe";
	    public WebDriver driver ; 
	     
	  @Test
	  public void verifyHomepageTitle() {
	       
	      System.out.println("launching firefox browser"); 
	      System.setProperty("webdriver.gecko.driver", driverPath);
	      driver = new FirefoxDriver();
	      driver.get(baseUrl);
	      Reporter.log("The browser is launched now");
	      String expectedTitle = "Welcome: Mercury Tours";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();
	      Reporter.log("The browser is closed now");
	  }
	}