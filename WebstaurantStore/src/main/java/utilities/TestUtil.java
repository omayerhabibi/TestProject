package utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.Page;

public class TestUtil extends Page {

	public static String screenshotPath;
	public static String screenshotName;
	
	// Takes screenshot of the failure
	public static void captureScreenshot() throws IOException {
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		
		// Screenshot sent to file in test-output folder with report
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "\\test-output\\html\\" + screenshotName));
	}
}
