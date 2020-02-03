package base;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import utilities.ExtentManager;

public class Page {

	public static WebDriver driver;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static WebDriverWait wait;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static String browser;
	
	public static void initConfiguration() {
		
		// Opens chrome to run test
		if (Constants.browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") +"\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			log.debug("Chrome Launched");
		}
		
		// Goes to the test site
		driver.get(Constants.testsiteurl);
		log.debug("Navigated to: " + Constants.testsiteurl);
		driver.manage().window().maximize();
		
	}
	
	public static void quitBrowser() {
		
		driver.quit();
	}
}
