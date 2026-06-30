package realtimeproject2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;

	//@FindBy (name = "email") WebElement email;
	
	//@FindBy (name = "pass") WebElement password;
	
	//@FindBy (xpath = "(//*[text()='Log in'])[1]") WebElement login;
	
	By email = By.name("email");
	By password = By.name("pass");
	
	By login = By.xpath("(//*[text()='Log in'])[1]");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void loginPage(String user, String pass) {
		
		driver.findElement(email).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
		
		
	}
	
	
	

}
