package utilities;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	private static ExtentReports extent;
	
	public static ExtentReports getInstance() {
		
		if (extent == null) {
			
			// Location of extent report
			extent = new ExtentReports(System.getProperty("user.dir") + "\\test-output\\html\\extent.html", true, DisplayOrder.OLDEST_FIRST);
			// Loading the reports config file
			extent.loadConfig(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\extentconfig\\ReportsConfig.xml"));
		}
		return extent;
	}
}
