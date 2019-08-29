package com.sample.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class OSVC_Sanity {
	
	


	@Test
	  public void Login() throws Exception {

			System.setProperty("webdriver.chrome.driver", "C:\\Shravan\\Jars\\chromedriver_win32Chrome72\\chromedriver.exe");
			WebDriver driver ;
			 //WebDriverWait wait = new WebDriverWait(driver,10);
			 DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
			 chromeCapabilities.setCapability("pageLoadStrategy","Normal");
			    // Open Chrome browser    
			    driver = new ChromeDriver();
			 
			    driver.get("https://ngpsservice--tst4.custhelp.com/AgentWeb/");
			    driver.findElement(By.xpath("//label[contains(text(),'Project Name')]/following::div[1]")).getAttribute("text"); 
	}
	


}
