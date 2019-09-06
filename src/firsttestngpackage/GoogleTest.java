package firsttestngpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	@BeforeMethod
	public void SetUp()
	{
		System.setProperty("webdriver.gecko.driver","C:/Mala java and selenium class/gecko 18/geckodriver/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		
	}
	@Test
	public void googleTitleTest()
	{
		String title=driver.getTitle();
		System.out.println("Title");
	}
	@Test
	public void nolinktest()
	{
		boolean b =driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@AfterMethod
	public void terminateBrowser()
	{
		driver.quit();
	}
	
}
