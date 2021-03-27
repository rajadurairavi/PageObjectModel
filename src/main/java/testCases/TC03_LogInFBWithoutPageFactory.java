package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TC03_LogInFBWithoutPageFactory {
	
	public static WebElement email;
	public static WebElement pass;
	public static WebElement login;
	
	@Test
	public void logInFaceBookWithoutPageFactory() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		PageFactory.initElements(driver, TC03_LogInFBWithoutPageFactory.class);
		email.sendKeys("rajaduraivijay@gmail.com");
		pass.sendKeys("Raja7*durai");
		login.click();
				
	}
}
