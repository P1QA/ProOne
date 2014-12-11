package PrologisOne;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import BasePageObjectActions.actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flyoutMenuMethods extends flyoutMenuLocators { 

	actions actions = new actions();
/**
 * Method CLicks the expand icon for the flyout menu.  Can be used to expand and collapse.
 * 
 * @author jmanhart
 * @date 12/10/14
 * @param driver
 */
	public void expandCollapseFlyout(WebDriver driver) {
		System.out.println("Starting ExpandCollapseFlyout method");
		actions.isClickable(driver, expandCollapseIcon,10);
		driver.findElement(expandCollapseIcon).click();
		System.out.println("ExpandCollapseFlyout method completed successfully");
	}
	
	public void clickRealEstateExpand(WebDriver driver) {
		System.out.println("Starting clickRealEstateExpand method");
		actions.isClickable(driver, RealEstate,10);
		driver.findElement(RealEstate).click();
		System.out.println("clickRealEstateExpand method completed successfully");
	}
	
	public void clickTestContentExpand(WebDriver driver) {
		System.out.println("Starting clickTestContentExpand method");
		actions.isClickable(driver, TestContent,10);
		driver.findElement(TestContent).click();
		System.out.println("clickTestContentExpand method completed successfully");
	}
	
	public void clickLeasing(WebDriver driver) {
		System.out.println("Starting clickLeasing method");
		actions.isClickable(driver, Leasing,2);
		driver.findElement(Leasing).click();
		actions.isVisible(driver, LeasingVerification,2);
		System.out.println("clickLeasing method completed successfully");
	}
	
	public void clickOperations(WebDriver driver) {
		System.out.println("Starting clickOperations method");
		actions.isClickable(driver, Operations, 10);
		driver.findElement(Operations).click();
		actions.isVisible(driver, operationsVerification,2);
		System.out.println("clickOperations method completed successfully");
	}
	
	public void clickCustomer(WebDriver driver) {
		System.out.println("Starting clickCustomer method");
		actions.isClickable(driver, customer,2);
		driver.findElement(customer).click();
		actions.isVisible(driver, customerLocator,2);
		System.out.println("clickCustomer method completed successfully");
	}
	
	public void clickCapDep(WebDriver driver) {
		System.out.println("Starting clickCapDep method");
		actions.isClickable(driver, capDep,2);
		driver.findElement(capDep).click();
		actions.isVisible(driver, capDepVerification,2);
		System.out.println("clickCapDep method completed successfully");
	}
}

