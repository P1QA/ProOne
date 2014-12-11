package PrologisOne;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flyoutMenuLocators {

	protected By expandCollapseIcon = By.xpath("/html/body/form/div[2]/div[1]/div/div[1]/div/div[1]/div[1]/div[2]/span");
	protected By RealEstate = By.xpath("/html/body/form/div[2]/div[1]/div/div[1]/div/div[1]/div[2]/div/div[2]/div[1]");
	protected By TestContent = By.xpath("/html/body/form/div[2]/div[1]/div/div[1]/div/div[1]/div[2]/div/div[8]/div[1]");
	protected By LandingPage = By.id("ProOneTheme_wt33_block_wtHeader_ProOneTheme_wt35_block_wt11_wt37");
	
	protected By Leasing = By.xpath("/html/body/form/div[2]/div[1]/div/div[1]/div/div[1]/div[2]/div/div[8]/div[2]/span/div[1]/div/div[2]/a");
	protected By customer = By.xpath("/html/body/form/div[2]/div[1]/div/div[1]/div/div[1]/div[2]/div/div[8]/div[2]/span/div[2]/div/div[2]/a");
	
	protected By Operations = By.xpath("/html/body/form/div[2]/div[1]/div/div[1]/div/div[1]/div[2]/div/div[2]/div[2]/span/div[1]/div/div[2]/a");
	protected By capDep = By.xpath("/html/body/form/div[2]/div[1]/div/div[1]/div/div[1]/div[2]/div/div[2]/div[2]/span/div[2]/div/div[2]/a");
	
	//Locator verifications
	protected By FilterSentence = By.className("FilterSentence");
	protected By LeasingVerification = By.id("ProOneTheme_wt33_block_wtPageTitleNavigation_wt5");
	protected By customerLocator = By.id("ProOneTheme_wt16_block_wtPageTitleNavigation_wt6");
	protected By operationsVerification = By.id("ProOneTheme_wt56_block_wtPageTitleNavigation_wt7");
	protected By capDepVerification = By.id("ProOneTheme_wt8_block_wtPageTitleNavigation_wt5");
    
}
