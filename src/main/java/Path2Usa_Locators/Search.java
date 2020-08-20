package Path2Usa_Locators;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Path2Usa_TestBase.TestBase_Testbase;

public class Search extends TestBase_Testbase
{

	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	String fy = fromY();
	String ty = toY();
	
	@FindBy(xpath="//input[@id='travel_from']") 	// Xpath for UserName
	WebElement From;
	
	@FindBy(xpath="//input[@id='travel_from']") 	// Xpath for UserName
	WebElement To;
	
	@FindBy(xpath="//input[@id='travel_date']") 	// Xpath for UserName
	WebElement Date;
	
	@FindBy(id="travel_airline") 	// Xpath for UserName
	WebElement Airline;
	
	@FindBy(id="travel_language") 	// Xpath for UserName
	WebElement Language;
	
	//Initializing the page object :
			public Search()
			{
				PageFactory.initElements(driver, this);
				
			}
			
			public Search SelectFrom()
			{
				
				To.sendKeys(fy);
				 			
				return new Search();
			}
			
			public Search SelectTo()
			{
				
				From.sendKeys(ty);
				 			
				return new Search();
			}
			
			public Search SelectDate()
			{
				String day = sheet.getRow(1).getCell(2).getStringCellValue();
				Date.sendKeys(day);
				 			
				return new Search();
			}
			
			public Search SelectAirline()
			{
				String air = sheet.getRow(1).getCell(3).getStringCellValue();
				Airline.sendKeys(air);
				 			
				return new Search();
			}
			
			public Search Selectlanguage()
			{
				String lan = sheet.getRow(1).getCell(4).getStringCellValue();
				Language.sendKeys(lan);
				 			
				return new Search();
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
