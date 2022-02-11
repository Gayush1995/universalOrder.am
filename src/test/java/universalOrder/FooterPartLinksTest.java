package universalOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.web365.universalorder.am.page.footerPartLinks.GoogleMapPage;
import com.web365.universalorder.am.page.footerPartLinks.UniversalOrderSendingEmailPage;
import com.web365.universalorder.am.page.home.UniversalOrderHomePage;
import com.web365.universalorder.am.page.productList.UniversalorderSpecialEquipmentProductsPage;

import universalOrder.base.UniversalOrderBaseTest;


public class FooterPartLinksTest  extends UniversalOrderBaseTest{

	@Test
	 public void sendEmailtest() throws InterruptedException {
//1.Universalorder.am page is open
		  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
		  Thread.sleep(5000);
		  @SuppressWarnings("deprecation")
		 	WebDriverWait w = new WebDriverWait(driver,3);
		   // presenceOfElementLocated condition
		   
		   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//div[@class='send-message pencil_edit']//input[@type='text']")));
 //2. Type valid email address In email input field 
	home.fillInEmail("gayush.hovhannisyan.95@mail.ru");
		Thread.sleep(5000);
//3.Click on "Ուղարկել" button
		UniversalOrderSendingEmailPage sendemail= home.goToUniversalOrderSendingEmailPageClick();
		home = home.logoClick();
	}
	@Test
	public void phonenumberTest() throws InterruptedException {
		UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
	  Thread.sleep(2000);

	Assert.assertTrue(home.phoneNumber.isDisplayed());
	home = home.logoClick();
	}
	@Test
	public void addressTest() throws InterruptedException {
		UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
	  Thread.sleep(2000);

	Assert.assertTrue(home.address.isDisplayed());
	home = home.logoClick();
	}
	@Test
	public void emailAddressTest() throws InterruptedException {
		UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
	  Thread.sleep(2000);

	Assert.assertTrue(home.emailAddress.isDisplayed());
	home = home.logoClick();
	}
	@Test
	public void workingTimeTest() throws InterruptedException {
		UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
	  Thread.sleep(2000);

	Assert.assertTrue(home.workingTime.isDisplayed());
	home = home.logoClick();
	
}
}