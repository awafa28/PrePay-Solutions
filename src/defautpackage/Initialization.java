package defautpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Initialization {
	public static WebDriver driver;
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
  }

  @AfterSuite
  public void afterSuite() {
  }

}
