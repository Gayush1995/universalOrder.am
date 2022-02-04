package universalOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.web365.universalorder.am.page.footerPartLinks.UniversalOrderSendingEmailPage;
import com.web365.universalorder.am.page.home.UniversalOrderHomePage;


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
	}
	
}
