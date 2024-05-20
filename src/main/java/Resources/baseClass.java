package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class baseClass {

	public WebDriver driver;
	
	public static String emailId=  generateRandomEmailId(); 
	public Properties prop;;

	// Webdriver driver = new Chromedriver();

	public void initilizeDriver() throws IOException {
		
		//read the properties file-                this path can use all system/device 
		
		FileInputStream fis = new FileInputStream (System.getProperty("user.dir") +"\\src\\main\\java\\Resources\\data.properties");
		
		//Access the data from properties file
		
		
	prop = new Properties();
		
		prop.load(fis);
	
		String browserName= prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			
			driver=new ChromeDriver();
			
		}
	
		else if
		(browserName.equalsIgnoreCase("firefox")) {
			
			driver=new FirefoxDriver();
			
		} else if
(browserName.equalsIgnoreCase("edge")) {
			
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Please choose the proper browser");
		}
	
	}
  
	//invaild data-- email id change frequently
	public static String  generateRandomEmailId() {
		// TODO Auto-generated method stub
		return "test"+System.currentTimeMillis()+"@gmail.com";
				
	}

	
	@BeforeMethod
	
	public void browserAndurlLaunch() throws IOException {

		initilizeDriver();
		
		driver.get(prop.getProperty("url"));
		
	}
	
	// To take the screenshot and store in one folder-
			public static String screenShot(WebDriver driver, String filename) {
				String dateAndTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				// 20240517100712
				
				File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				String destination = System.getProperty("user.dir") + "\\ScreenShot\\" + filename + "_" + dateAndTime + ".png";
				
				File source1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				String destination1 = System.getProperty("user.dir") + "\\ScreenShot\\" + filename + "_" + dateAndTime + ".png";
				
				@BeforeSuite
				public void ExtentReport() {
					extentReportManager.setup();
				}
				
				@AfterSuite
				public void endReport() {
					extentReportManager.endReport();
				}

		
	}
}
