package realtimeproject2;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;



public class TestClass extends BaseClass {
	
	ExtentReports extent;
	
	ExtentTest test;
	
	
	@Test (dataProvider = "Customer Credentials")
	public void ts1(String username, String password) throws Exception {
		
		extent = ExtentReportsClass.getReports();
		
		test = extent.createTest("Fb Test");
		
		LoginPage login = new LoginPage(driver);
		
		ScreenshotClass ss = new ScreenshotClass(driver);
		
		
		logger.info("Entering credentials");
		test.info("Entering credentials");
		
		
		ss.takeScreenshot("before entering cred");
		
		
		login.loginPage(username,password);
		
		ss.takeScreenshot("after entering cred");
		
		Thread.sleep(2000);
		
		test.pass("Test case passed");
		
		extent.flush();
		
		
	}
	
	@DataProvider (name = "Customer Credentials")
	public Object[][] customerCredentails() throws Exception{
		
		return  new Object[][] {
			{ExcelDataClass.getData(0, 0),
				ExcelDataClass.getData(0, 1)},
				{ExcelDataClass.getData(1, 0),
					ExcelDataClass.getData(1, 1)},
				{ExcelDataClass.getData(2, 0),
						ExcelDataClass.getData(2, 1)}
		};
		
		
	}

}
