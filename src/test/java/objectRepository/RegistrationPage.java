package objectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

	// Registration Page Object Repository is here
	// For Username Textbox,Email Textbox,Password Textbox,ConfirmPassword,Location and Signup Button
	public static  WebElement txtUsername(WebDriver driver)
	{
		//Here Identifying the Username Text Box from Registration page
		WebElement txtUsername = driver.findElement(By.xpath("//div[@class='formblock1']//input[@Name='username']"));
		return txtUsername;
	}
	public static  WebElement txtEmail(WebDriver driver)
	{
		//Here Identifying the Email Text Box from Registration page
		WebElement txtEmail = driver.findElement(By.xpath("//div[@class='formblock1']//input[@Name='useremail']"));
		return txtEmail;
	}
	public static  WebElement txtPassword(WebDriver driver)
	{
		//Here Identifying the Password Text Box from Registration page
		WebElement txtPassword = driver.findElement(By.xpath("//div[@class='formblock1']//input[@Name='userpassword']"));
		return txtPassword;
	}
	public static  WebElement txtConfirmPassword(WebDriver driver)
	{
		//Here Identifying the Confirm Password Text Box from Registration page
		WebElement txtConfirmPassword = driver.findElement(By.xpath("//div[@class='formblock1']//input[@Name='userconformpassword']"));
		return txtConfirmPassword;
	}
	public static  WebElement txtLoction(WebDriver driver)
	{
		//Here Identifying the Location Text Box from Registration page
		WebElement txtLoction = driver.findElement(By.xpath("//div[@class='formblock1']//input[@Name='searchStr']"));
		return txtLoction;
	}
	public static WebElement optService(WebDriver driver,int index){
		WebElement  optService = driver.findElements(By.xpath("//div[@class='formblock1']//input[@name='role']")).get(index);	
		return optService;
	}
	public static  WebElement btnSinup(WebDriver driver)
	{
		//Here Identifying the Location Text Box from Registration page
		WebElement btnSinup = driver.findElement(By.xpath("//div[@class='formblock1']//input[@Name='signupsubmit']"));
		return btnSinup;
	}
	 
	
}
