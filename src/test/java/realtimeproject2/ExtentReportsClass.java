package realtimeproject2;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsClass {
	
	public static ExtentReports getReports() {
		
		ExtentSparkReporter spark = new ExtentSparkReporter("./ExtentReports/UIReport121.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(spark);
		
		return extent;
	}

}
