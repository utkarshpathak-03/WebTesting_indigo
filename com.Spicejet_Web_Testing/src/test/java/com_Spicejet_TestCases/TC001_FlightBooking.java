package com_Spicejet_TestCases;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TC001_FlightBooking extends TestBase
{
	
	
	
	public  WebDriver driver;
	//public static Logger logger;

		
	@Parameters("browser")	
	@BeforeClass
	void StartApplication(String BrowserName ) throws InterruptedException
	{
		 //logger=Logger.getLogger(TstBase.class);
		 //PropertyConfigurator.configure("log4j.properties");
		 //logger.setLevel(Level.DEBUG);
		 logger.info("############################In TestCase Class############################");
		if(BrowserName.equalsIgnoreCase("chrome"))	
		{
			System.setProperty(VariableClass.CHROMEDRIVER, VariableClass.CHROMEDRIVER_PATH);
			driver=new ChromeDriver();}
		else if(BrowserName.equalsIgnoreCase("firefox")) 
		{
			System.setProperty(VariableClass.GECKODRIVER, VariableClass.GECKODRIVER_PATH);
			driver=new FirefoxDriver();
			
		}
		driver.get(VariableClass.WEB_URL);
		driver.manage().window().maximize();
		logger.info("#######################Opened Browser Successfully###########################");
		
	
	}
	@Test
	void checkFunctionality() throws InterruptedException, ReflectiveOperationException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException
	{
		boolean res = driver.findElement(By.xpath("//label[text()='One Way']")).isDisplayed();
		
		Assert.assertTrue(res);
		logger.info("###########################Radio Button Exceution Startedd###########################");
		//WebElement radio=driver.findElement(By.xpath("//label[text()='Multi-city']"));
		//RadioButton.CallMethod("Radio_Act_ClickButtton",radio,"a");
		Thread.sleep(2000);
		ExcelUtilities xl=new ExcelUtilities();
		//int rowCount=xl.GetRowCount(VariableClass.WORKBOOK_LOCATION+VariableClass.WORKBOOK_NAME_TC001, VariableClass.WORKBOOK_SHEET_NAME);
		//int colCount=xl.GetCellCount(VariableClass.WORKBOOK_LOCATION+VariableClass.WORKBOOK_NAME_TC001, VariableClass.WORKBOOK_SHEET_NAME, 1);
		//int c=xl.traverseExcelSheet(VariableClass.WORKBOOK_LOCATION+VariableClass.WORKBOOK_NAME_TC001, VariableClass.WORKBOOK_SHEET_NAME);
		
		String Values[][]=new String[20][4];
		for(int i=1;i<=20;i++)
		{
			for(int j=5;j<9;j++)
			{
				Values[i-1][j-5]=xl.GetCellData(VariableClass.WORKBOOK_LOCATION+VariableClass.WORKBOOK_NAME_TC001, VariableClass.WORKBOOK_SHEET_NAME, i, j);
			}
		}
		
		
		for(int k=0;k<20;k++)
		{
			try {
			System.out.println("Xpath = "+Values[k][3]+"className +"+Values[k][2]);
			TestActions.CallClass(Values[k][0], Values[k][3], Values[k][1],Values[k][2],driver);
		//					    (MethodName ,     XPATH,     testData,    ClassName,    driver)
			Thread.sleep(2000);
			System.out.println();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
	
	@AfterClass
	void CloseBrowser()
	{
		
		
		//driver.quit();
		logger.info("#######################Closed Browser Successfully###########################");
		
	}

}
	
	

