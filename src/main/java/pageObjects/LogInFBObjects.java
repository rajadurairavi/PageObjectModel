package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInFBObjects {

	@FindBy(xpath ="//input[@name='email']" )
	public static WebElement UserName;
	
	@FindBy(xpath = "//input[@id='pass']")
	public static WebElement Password;
	
	@FindBy(xpath="//button[text()='Log In']")
	public static WebElement Submit;	
	
}
