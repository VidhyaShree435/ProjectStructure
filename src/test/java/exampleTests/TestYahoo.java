package exampleTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestYahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver driver;
                
				System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
				
				driver = new ChromeDriver();
				
				// Navigate to Google
				driver.get("https://www.yahoo.com/");
				driver.manage().window().maximize();
			
	}

}
