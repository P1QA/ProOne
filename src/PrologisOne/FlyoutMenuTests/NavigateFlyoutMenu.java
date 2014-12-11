package PrologisOne.FlyoutMenuTests;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import BasePageObjectActions.actions;
import PrologisOne.flyoutMenuMethods;

public class NavigateFlyoutMenu{
	
	

	
	public static void main(String[] args){
		
		flyoutMenuMethods flyout = new flyoutMenuMethods();
		//Firefox
//		WebDriver driver = new FirefoxDriver();
		//Chrome
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jmanhart\\Desktop\\Selenium\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		//IE
		System.setProperty("webdriver.ie.driver", "C:\\Users\\jmanhart\\Desktop\\Selenium\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		String baseUrl;
		
		System.out.println("Begin Navigate Flyout Menu Links Test");
		
		    baseUrl = "https://test.prologisone.com/";
		    driver.get(baseUrl + "PrologisOne/");
		    driver.manage().window().maximize();
		    
			flyout.expandCollapseFlyout(driver);

			//Test Content Section
			flyout.clickTestContentExpand(driver);
			flyout.clickLeasing(driver);
			flyout.expandCollapseFlyout(driver);
			flyout.clickCustomer(driver);
			
			//Real Estate Section
			flyout.expandCollapseFlyout(driver);
			flyout.clickRealEstateExpand(driver);
			flyout.clickOperations(driver);
			flyout.expandCollapseFlyout(driver);
			flyout.clickCapDep(driver);
	
			driver.quit();
			System.out.println("Navigate Flyout Menu Links: Test Passed");
	}
}

