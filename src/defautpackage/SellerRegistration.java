package defautpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class SellerRegistration extends Initialization{
	
	int ran;
	String email;
  @BeforeTest
  public void beforeTest() {
	 
	  
      driver.get("https://prepayqa.swipezoom.com:18443/bpm/signup/"); 
      //Random number generator
	  int max=10000;
	    int min=5000;
	    int diff=max-min;
	    Random rn = new Random();
	    ran = rn.nextInt(diff+1);
	    ran+=min;
	    System.out.print("The Random Number is " + ran);
  }
  @Test(priority=0)
  public void SignUp() {
	  email = "Test"+ran+"@swipezoom.com";
	  driver.findElement(By.id("signupBean_userFirstName")).sendKeys("Test");
	  driver.findElement(By.id("signupBean_userLastName")).sendKeys("Test");
	  driver.findElement(By.id("signupBean_companyName")).sendKeys("TestComp");
	  driver.findElement(By.id("signupBean_landlineNumber")).sendKeys("28838388");
	  driver.findElement(By.id("signupBean_userEmail")).sendKeys(email);
	  driver.findElement(By.id("signupBean_mobileNumber")).sendKeys("2299933");
	  driver.findElement(By.id("signupBean_userPassword")).sendKeys("swipezoom123#");
	  driver.findElement(By.id("signupBean_userConfirmPassword")).sendKeys("swipezoom123#");
	  driver.findElement(By.xpath("//*[@id='sign_up_form']/div[2]/div[7]/div/input")).click();
	  Reporter.log("Sign up process completed successfully");
  }
  @Test(priority=1)
  public void Login() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath(".//*[@id='userBean_userId']")).sendKeys(email);
	  driver.findElement(By.xpath(".//*[@id='userBean_password']")).sendKeys("swipezoom123#");
	  driver.findElement(By.xpath(".//*[@id='login_form']/div/div[5]/div/input")).click();;
      Reporter.log("User logged in successfully");
  }
	  @AfterTest
  public void afterTest() {
		  //driver.close
  }

}
