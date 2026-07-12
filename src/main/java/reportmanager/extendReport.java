package reportmanager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extendReport {
	  
	  public static ExtentReports getReport() {

	        ExtentSparkReporter spark =
	                new ExtentSparkReporter("Reports/TestReport.html");

	        spark.config().setReportName("Appium Automation Report");
	        spark.config().setDocumentTitle("Execution Report");

	        ExtentReports extent = new ExtentReports();

	        extent.attachReporter(spark);

	        extent.setSystemInfo("Tester", "QA");

	        extent.setSystemInfo("Platform", "Android");

	        return extent;

	    }
	
	
	
}