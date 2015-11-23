package testSuite;
//Importing Object Repository
import objectRepository.LoginPage;
//Use the valid login credentials to Login
//Verify the sucessfull login message.
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Login {
	WebDriver driver = new FirefoxDriver();
	String BaseURL ="http://build.thejobupdates.com/#/";
	String ExpectedResults ="DEALANCE";
	String ActualResults ="";
	String Username ="murlikrishna4";
	String Password ="123456789";
  @Test
  public void login() throws Throwable {
	  try{
	  //here the placeholder is using as object identification
	
	   LoginPage.txtUsername(driver).clear();
	   LoginPage.txtUsername(driver).sendKeys(Username); 
	   LoginPage.txtPassword(driver).clear();
	   LoginPage.txtPassword(driver).sendKeys(Password);
	   LoginPage.btnLogin(driver).click();
	   //-------------------------------------------------------
	   //Verifing the values
	   //-------------------------------------------------------
	   //Username Verifying
	   ActualResults =objectRepository.LoginPage.txtUsername(driver).getAttribute("value"); 
	   Assert.assertEquals(ActualResults, Username);	   
	   //Password Verifing
	   ActualResults =objectRepository.LoginPage.txtPassword(driver).getAttribute("value"); 
	   Assert.assertEquals(ActualResults, Password);
	  }
	catch(NoSuchElementException e){
		 System.out.println(e);
	 }
  }
  @BeforeTest
  public void beforeTest() {
	  driver.get(BaseURL);
	  ActualResults = driver.getTitle();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  if (ActualResults.contentEquals(ExpectedResults)){
		  System.out.println("Passed:Test URL landed Sucessfully");}
		  else{
			  System.out.println("Failed:Test URL landed Unsucessfully");
		  }
	  }
  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
