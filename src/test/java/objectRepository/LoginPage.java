package objectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class LoginPage {
// Login Page Object Repository is here
// For Username Textbox,Password Textbox and Login Button
public static  WebElement txtUsername(WebDriver driver)
{
	//Here Identifying the Username Text Box from Login page
	WebElement txtUsername = driver.findElement(By.xpath("//div[@class='fieldsblock1']//input[@placeholder='Enter Username / Email Address']"));
	return txtUsername;
}
public static WebElement txtPassword(WebDriver driver)
{
	//Here Identifying the Password Text Box from Login Page
	WebElement txtPassword = driver.findElement(By.xpath("//div[@class='fieldsblock1']//input[@placeholder='Enter Password']"));
	return txtPassword;
	
}
public static WebElement btnLogin(WebDriver driver)
{
	WebElement btnLogin=driver.findElement(By.xpath("//div[contains(@class,'formblock1')]//input[@value='Login']"));
	return btnLogin;
}
}
