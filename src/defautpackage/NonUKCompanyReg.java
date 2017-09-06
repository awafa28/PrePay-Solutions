package defautpackage;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class NonUKCompanyReg extends Initialization {
	
  @Test
  public void CompanyDetails() throws InterruptedException {
	 Thread.sleep(3000);
     Select country = new Select(driver.findElement(By.xpath(".//*[@id='registerCompanyProfileBean_officeCountry']")));
	 country.selectByValue("FRA");
	 driver.findElement(By.xpath(".//*[@id='registerCompanyProfileBean_officeCountry']")).sendKeys(Keys.TAB);
	 driver.findElement(By.id("registerCompanyProfileBean_crnNumber")).sendKeys("83848384");
	 driver.findElement(By.id("registerCompanyProfileBean_companyName")).sendKeys("TestComp");
	 driver.findElement(By.id("registerCompanyProfileBean_officeAddress")).sendKeys("address");
	 driver.findElement(By.xpath(".//*[@id='companyIdentificationNoIssueDiv']/span/span")).click();
	 driver.findElement(By.xpath(".//*[@id='main_body']/div[8]/div[1]/table/tbody/tr[3]/td[4]")).click();
	 driver.findElement(By.id("registerCompanyProfileBean_officeCity")).sendKeys("city");
	 driver.findElement(By.id("registerCompanyProfileBean_tradePartnerInfoList_0_sellerPartnerName")).sendKeys("Director");
	 driver.findElement(By.xpath(".//*[@id='registerCompanyProfileBean_tradePartnerInfoList_0_passportFile_sellerDoc']")).
	 sendKeys("C:\\Users\\Tina\\Desktop\\1.pdf");
	 driver.findElement(By.xpath(".//*[@id='registerCompanyProfileBean_tradePartnerInfoList_0_utilityBill_sellerDoc']")).
	 sendKeys("C:\\Users\\Tina\\Desktop\\1.pdf");
	 Reporter.log("Company Information saved Successfully");
	WebElement Nextbtn = driver.findElement(By.xpath(".//*[@id='register_Company_profile_form']/div[27]/div/input[3]"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Nextbtn);
	Nextbtn.click();
  }
  @Test(priority=1)
  public void PrimaryContactDetails() throws InterruptedException {
	 Thread.sleep(3000);
	 driver.findElement(By.xpath(".//*[@id='registerCompanyAddressInfoBean_adminAddressInfo_firstName']")).sendKeys("Primary");
	 driver.findElement(By.xpath(".//*[@id='registerCompanyAddressInfoBean_adminAddressInfo_lastName']")).sendKeys("Contact");
	 driver.findElement(By.xpath(".//*[@id='registerCompanyAddressInfoBean_adminAddressInfo_phone']")).sendKeys("2323232323");
	 driver.findElement(By.xpath(".//*[@id='registerCompanyAddressInfoBean_adminAddressInfo_mobile']")).sendKeys("2232323232");
	 driver.findElement(By.xpath(".//*[@id='registerCompanyAddressInfoBean_adminAddressInfo_email']")).sendKeys("pcontact@company.com");
	 Reporter.log("Primary Contact Details saved Successfully");
  }
  @Test(priority=2)
  public void AccountContactDetails() throws InterruptedException {
	 Thread.sleep(3000);
	 driver.findElement(By.xpath(".//*[@id='registerCompanyAddressInfoBean_managerAddressInfo_firstName']")).sendKeys("Account");
	 driver.findElement(By.xpath(".//*[@id='registerCompanyAddressInfoBean_managerAddressInfo_lastName']")).sendKeys("Contact");
	 driver.findElement(By.xpath(".//*[@id='registerCompanyAddressInfoBean_managerAddressInfo_phone']")).sendKeys("2323232323");
	 driver.findElement(By.xpath(".//*[@id='registerCompanyAddressInfoBean_managerAddressInfo_mobile']")).sendKeys("2232323232");
	 driver.findElement(By.xpath(".//*[@id='registerCompanyAddressInfoBean_managerAddressInfo_email']")).sendKeys("acontact@company.com");
	 WebElement contNextbtn = driver.findElement(By.xpath(".//*[@id='register_company_address_info_form']/div[11]/div/input[4]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", contNextbtn);
		contNextbtn.click();
		Thread.sleep(4000);
	 WebElement GNextbtn= driver.findElement(By.xpath(".//*[@id='registration_ui_config_form']/div[3]/div/input[4]"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", GNextbtn);
	 GNextbtn.click();
	 Reporter.log("Account Contact Details saved Successfully");
  }
   @Test(priority=3)
   public void BankDetails() throws InterruptedException {
	 Thread.sleep(3000);
	 driver.findElement(By.xpath(".//*[@id='registerBankInfoBean_bankAccountTitle']")).sendKeys("AcctName");
	 driver.findElement(By.xpath(".//*[@id='registerBankInfoBean_bankAccountNumber']")).sendKeys("23342323231121");
	 driver.findElement(By.xpath(".//*[@id='registerBankInfoBean_bankSortCode']")).sendKeys("0");
	 driver.findElement(By.xpath(".//*[@id='registerBankInfoBean_bankName']")).sendKeys("ADIB");
	 WebElement BNextbtn =  driver.findElement(By.xpath(".//*[@id='register_bank_info_form']/div[5]/div/input[4]"));
	 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", BNextbtn);
	 BNextbtn.click();
	 Reporter.log("Seller bank information saved successfully");
  }
   @Test(priority=4)
   public void UBOForm() throws InterruptedException {
	 Thread.sleep(3000);
	 driver.findElement(By.xpath(".//*[@id='registerUBOFormBean_authLegalRepresentative']")).sendKeys("Legal person");
	  WebElement radiobtn = driver.findElement(By.id("registerUBOFormBean_isListedOrganizedMarketTtrue"));
	 ((JavascriptExecutor)driver).executeScript("scroll(0, 60);");
	 radiobtn.click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("registerUBOFormBean_tradingVenue")).sendKeys("50");
	 driver.findElement(By.id("registerUBOFormBean_stockExchange")).sendKeys("50");
	 WebElement UBOFormdldbtn = driver.findElement(By.id("save_download_ubo"));
	 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", UBOFormdldbtn); 
	 UBOFormdldbtn.click();
	 Reporter.log("UBO Form download is complete");
	 driver.findElement(By.id("registerUBOFormBean_filledUboForm_sellerDoc")).sendKeys("C:\\Users\\Tina\\Desktop\\1.pdf");
	 WebElement submitbtn = driver.findElement(By.xpath(".//*[@id='download_filled_ubo_form']/div[31]/div/input[4]"));
	 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", submitbtn); 
	 WebDriverWait wait = new WebDriverWait(driver,15);
	 wait.until(ExpectedConditions.elementToBeClickable(submitbtn));
	 submitbtn.click();
	 Reporter.log("UBO Form upload is complete");
	 Reporter.log("Seller Registration Completed Successfully"); 
	 driver.close();
  }
  @AfterTest
  public void afterTest() {
	  
  }

}
