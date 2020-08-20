package Path2Usa_TestBase;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ser.PropertyBuilder;



public class TestBase_Testbase 
{
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static WebDriver driver; 
	
	public static void initialization() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ragavendra\\Desktop\\Cucumber framework\\Cucumber framework\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			//InputStreamReader in;
			driver.get("https://www.path2usa.com/travel-companions");
			driver.manage().window().maximize();
			//StringBuilder sb = new StringBuilder();
			
			System.out.println("The site got opened successfully");
			
			
		//	driver.close();
		//driver.quit();
		} catch (Exception e) {
			//driver.close();
			//driver.quit();
		}
	}

	
	
	}


