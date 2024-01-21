package exampleTests;

import config.ConfigurationDriver;
import config.PartyConfig;


public class TestCandySite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		   PartyConfig  configObj = new ConfigurationDriver();
		  
           configObj.navigateToUrl();
           configObj.closeBttn();
           configObj.clickOnLink();
           configObj.printButtonText();
           configObj.clickOnBtn();
           configObj.closeBrowser();
        
	}

}
