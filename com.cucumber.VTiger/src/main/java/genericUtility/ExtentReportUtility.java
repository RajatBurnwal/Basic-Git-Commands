package genericUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {

	ExtentReports reports;
	
	public void createReport()
	{
		ExtentSparkReporter reporter=new ExtentSparkReporter(".\\Reports\\extentreport.html");
		
		reports = new ExtentReports();
		reports.attachReporter(reporter);
	}
	
	public void flushReport()
	{
		reports.flush();
	}
}
