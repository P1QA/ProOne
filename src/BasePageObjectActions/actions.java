package BasePageObjectActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actions {

	
	public void isVisible(WebDriver driver,  By Locator, int seconds){
		
		WebElement myDynamicElement = (new WebDriverWait(driver, seconds))
			  .until(ExpectedConditions.presenceOfElementLocated(Locator));
		System.out.println(Locator + " found!");
	}
	
	public void isClickable(WebDriver driver,  By Locator, int seconds){
		
		WebElement myDynamicElement = (new WebDriverWait(driver, seconds))
			  .until(ExpectedConditions.elementToBeClickable(Locator));
		System.out.println(Locator + " clickable!");
	}
	
}
