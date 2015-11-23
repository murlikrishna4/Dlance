package testSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objectRepository.RegistrationPage;
public class Registration {
	WebDriver driver = new FirefoxDriver();
	String BaseURL ="http://build.thejobupdates.com/#/signup";
	String Username ="murlikrishna4";
	String Email ="murlikrishna4@gmail.com";
	String Password ="123456789";
	String ConfirmPassword ="123456789";
	String Location ="Hyderabad";
	String ExpectedResults ="DEALANCE";
	String ActualResults ="";
	Boolean boolActualResults=null;
	int Service=1;
  @Test
  public void registration() {
	  try{
		  //here name attribute is using as object identification
		  RegistrationPage.txtUsername(driver).click();
		  RegistrationPage.txtUsername(driver).sendKeys(Username);
		  RegistrationPage.txtEmail(driver).clear();
		  RegistrationPage.txtEmail(driver).sendKeys(Email);
		  RegistrationPage.txtPassword(driver).clear();
		  RegistrationPage.txtPassword(driver).sendKeys(Password);
		  RegistrationPage.txtConfirmPassword(driver).clear();
		  RegistrationPage.txtConfirmPassword(driver).sendKeys(ConfirmPassword);
		  RegistrationPage.txtLoction(driver).clear();
		  RegistrationPage.txtLoction(driver).sendKeys(Location);
		  RegistrationPage.optService(driver,Service).click();
		  RegistrationPage.btnSinup(driver).click();
		  //verifying Entered values
		  ActualResults = RegistrationPage.txtUsername(driver).getAttribute("Value");
		  Assert.assertEquals(ActualResults, Username);
		  ActualResults = RegistrationPage.txtEmail(driver).getAttribute("Value");
		  Assert.assertEquals(ActualResults, Email);
		  ActualResults = RegistrationPage.txtPassword(driver).getAttribute("Value");
		  Assert.assertEquals(ActualResults, Password);
		  ActualResults = RegistrationPage.txtConfirmPassword(driver).getAttribute("Value");
		  Assert.assertEquals(ActualResults, ConfirmPassword);
		  ActualResults = RegistrationPage.txtLoction(driver).getAttribute("Value");
		  Assert.assertEquals(ActualResults, Location);  
		  boolActualResults = RegistrationPage.optService(driver, Service).isSelected();
		  Assert.assertTrue(boolActualResults);
	  }catch(NoSuchElementException e){
		  System.out.println(e);
	  }  
  }
  @BeforeTest
  public void beforeTest() {
	  driver.get(BaseURL);
	  ActualResults = driver.getTitle();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  if (ActualResults.contentEquals(ExpectedResults)){
		  System.out.println("Passed:Test URL landed Sucessfully");}
		  else{
			  System.out.println("Failed:Test URL landed Unsucessfully");
		  }
	  }
  @AfterTest
  public void afterTest(){
	  //driver.close();
	 // driver.quit();
	  
  }
}
