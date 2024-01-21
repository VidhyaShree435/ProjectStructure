package config;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigurationDriver implements PartyConfig {

	 private WebDriver driver;
	
	 public ConfigurationDriver() {
	        setupWebDriver();
	        configureDriver();
	    }

	private void setupWebDriver() {
	        // Set up the WebDriver here
	        System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
	        this.driver = new ChromeDriver();
	    }
	 
    public void configureDriver() {
    	
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
    }

    public void navigateToUrl() {
        driver.get("https://candymapper.com/");
    }

    public void closeBttn() {
        WebElement ele = driver.findElement(By.xpath(Locator.POPUP_BUTTON_XPATH));
        ele.click();
    }

    public void clickOnLink() {
        WebElement link = driver.findElement(By.xpath(Locator.LINK_XPATH));
        link.click();
    }

    public void clickOnBtn() {
        WebElement button = driver.findElement(By.xpath(Locator.PARTY_BUTTON_XPATH));
        button.click();
    }

    public void printButtonText() {
        WebElement button = driver.findElement(By.xpath(Locator.PARTY_BUTTON_XPATH));
        String buttonText = button.getText();
        System.out.println("Button text: " + buttonText);
    }


    public void handleAlertAccept() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void handleAlertDismiss() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public String getAlertText() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void closeBrowser() {
        driver.quit();
    }
    

}
