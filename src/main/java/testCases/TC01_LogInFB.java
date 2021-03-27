package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LogInFBObjects;

public class TC01_LogInFB {
	
	@Test
	public void loginFaceBook() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		PageFactory.initElements(driver, LogInFBObjects.class);
		LogInFBObjects.UserName.sendKeys("rajaduraivijay@gmail.com");
		LogInFBObjects.Password.sendKeys("Raja7*durai");
		LogInFBObjects.Submit.click();
		
			
	}
	
	
	
	
	

}
