package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static Properties propp;
	public static WebDriver driver;
	
	public TestBase() {
		propp= new Properties();
		try {
			FileInputStream files = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\config\\Config.properties");
			propp.load(files);
		} catch (FileNotFoundException e) {
			System.out.println("Please check you Constructor");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	
	}
			
	public void initn() {
		String browser= propp.getProperty("browser1");
		
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver(); 
			driver.manage().timeouts().implicitlyWait(utility.implicitly_Wait, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(utility.pageLoad_Timeout, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			
		}
		else if(browser.equals("IE"));
	}		
	
	public static void launchApplication(String URL) {
		
		driver.get("https://demoblaze.com/");
		
	}
	
	
	

}
