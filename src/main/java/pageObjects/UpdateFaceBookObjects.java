package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateFaceBookObjects {
	
	@FindBy(xpath = "//*[@id=\'mount_0_0_wM\']/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]")
	public static WebElement ProfileButton;
	
	@FindBy(xpath="//*[text()='Log Out']")
	public static WebElement LogOutButton;
	
}
