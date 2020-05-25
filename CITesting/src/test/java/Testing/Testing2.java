package Testing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Testing2 {
	

	public class NewTests {
		
		public WebDriver driver;
		
	  @Test
	  public void open() {
		driver.get("https://www.userlytics.com/");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }

	}
}
	

