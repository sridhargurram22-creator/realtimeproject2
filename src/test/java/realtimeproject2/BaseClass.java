package realtimeproject2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	WebDriver driver;
	WebDriverWait wait;
	
	Logger logger =
            LoggerFactory.getLogger(getClass());
	
	@BeforeMethod
	public void openApp() {
		
		driver = new ChromeDriver();
		
		logger.info("Browser launched");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		logger.info("Opening face book application");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		
	}
	
	
	@AfterMethod
	public void closeApp() {
		
		driver.quit();
		
		logger.info("Browser closed");
	}

}
