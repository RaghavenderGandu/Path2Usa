package Path2Usa_TestBase;

import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ragavendra\\Desktop\\Cucumber framework\\Cucumber framework\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			//InputStreamReader in;
			driver.get("https://www.path2usa.com/travel-companions");
			driver.manage().window().maximize();
			//StringBuilder sb = new StringBuilder();
			
			System.out.println("The site got opened successfully");
			String fy = fromY();
			String ty = toY();

			if (fy.equals(ty)) {
				System.out.println("Both From and To locations are same");
			} else {
				driver.findElement(By.id("travel_from")).sendKeys(fy);
				//driver.findElement(By.id("travel_from")).sendKeys(Keys.SPACE);
				//Thread.sleep(5000);
				//driver.findElement(By.id("travel_from")).sendKeys(Keys.ARROW_DOWN);
				//driver.findElement(By.xpath("//div[@id='ajax_listOfOptions']//div[1]")).click();
				//driver.findElement(By.id("travel_from")).sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				driver.findElement(By.id("travel_to")).sendKeys(ty);
				String day = sheet.getRow(1).getCell(2).getStringCellValue();
				WebElement datebox = driver.findElement(By.xpath("//input[@id='travel_date']"));
				datebox.click();
				for (int i = 1; i <= 20; i++) {
					datebox.sendKeys(Keys.BACK_SPACE);
				}
				datebox.sendKeys("       ");
				for (int i = 1; i <= 20; i++) {
					datebox.sendKeys(Keys.BACK_SPACE);
				}
				datebox.sendKeys(day);

				String air = sheet.getRow(1).getCell(3).getStringCellValue();
				Select airline = new Select(driver.findElement(By.id("travel_airline")));
				airline.selectByVisibleText(air);

				String lan = sheet.getRow(1).getCell(4).getStringCellValue();
				Select language = new Select(driver.findElement(By.id("travel_language")));
				language.selectByVisibleText(lan);
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			}
		//	driver.close();
		//driver.quit();
		} catch (Exception e) {
			//driver.close();
			//driver.quit();
		}
	}

	public static String fromY() {
		try {
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath + "/Excel/Book1.xlsx");
			sheet = workbook.getSheet("Sheet1");
			return sheet.getRow(1).getCell(0).getStringCellValue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return "";
	}

	public static String toY() {
		try {
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath + "/Excel/Book1.xlsx");
			sheet = workbook.getSheet("Sheet1");
			return sheet.getRow(1).getCell(1).getStringCellValue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return "";
	}
	
}