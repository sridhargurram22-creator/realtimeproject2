package realtimeproject2;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass {
	
	WebDriver driver;
	
	public ScreenshotClass(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void takeScreenshot(String name) throws Exception {
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path = "./Screenshots/" + name + ".png";
		
		FileHandler.copy(src, new File(path));
		
	}

}
