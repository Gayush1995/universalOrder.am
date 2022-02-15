package universalOrderPartnersPageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;
import com.web365.universalorder.am.page.menu.UniversalOrderPartnersPage;

import universalOrder.base.UniversalOrderBaseTest;

public class OurPartnersNotClickableLinksTest extends UniversalOrderBaseTest{

		@Test
		public void vivaldipartnerLinkTest() throws InterruptedException { 
		//1.UniversalOrder.am is open
		
		  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
	   //2.Click <Our Partner> Link From menu list
		  UniversalOrderPartnersPage partners=home.goToPartners();
		 Thread.sleep(2000);
		
		  @SuppressWarnings("deprecation")
		 	WebDriverWait w = new WebDriverWait(driver,3);
		   // presenceOfElementLocated condition
		   
		   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/partners/3.jpg']")));
	   //3.Verify that  <Vivaldi> partner picture is present
		   Assert.assertTrue(driver.findElement(By.xpath("//img[@src='/img/partners/3.jpg']")).isDisplayed());
		

		}
@Test
public void cactuspartnerLinkTest() throws InterruptedException { 
//1.UniversalOrder.am is open

  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
//2.Click <Our Partner> Link From menu list
  UniversalOrderPartnersPage partners=home.goToPartners();
 Thread.sleep(2000);

  @SuppressWarnings("deprecation")
 	WebDriverWait w = new WebDriverWait(driver,3);
   // presenceOfElementLocated condition
   
   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/partners/6.jpg']")));
//3.Verify that  <Cactus> partner picture is present
   Assert.assertTrue(driver.findElement(By.xpath("//img[@src='/img/partners/6.jpg']")).isDisplayed());


}
@Test
public void oldErevanHoldingpartnerLinkTest() throws InterruptedException { 
//1.UniversalOrder.am is open

  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
//2.Click <Our Partner> Link From menu list
  UniversalOrderPartnersPage partners=home.goToPartners();
 Thread.sleep(2000);

  @SuppressWarnings("deprecation")
 	WebDriverWait w = new WebDriverWait(driver,3);
   // presenceOfElementLocated condition
   
   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/partners/7.jpg']")));
//3.Verify that  <Old Erevan Holding> partner picture is present
   Assert.assertTrue(driver.findElement(By.xpath("//img[@src='/img/partners/7.jpg']")).isDisplayed());


}
@Test
public void marcoPolopartnerLinkTest() throws InterruptedException { 
//1.UniversalOrder.am is open

  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
//2.Click <Our Partner> Link From menu list
  UniversalOrderPartnersPage partners=home.goToPartners();
 Thread.sleep(2000);

  @SuppressWarnings("deprecation")
 	WebDriverWait w = new WebDriverWait(driver,3);
   // presenceOfElementLocated condition
   
   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/partners/9.jpg']")));
//3.Verify that  <Marco Polo> partner picture is present
   Assert.assertTrue(driver.findElement(By.xpath("//img[@src='/img/partners/9.jpg']")).isDisplayed());
}
@Test
public void libananpartnerLinkTest() throws InterruptedException { 
//1.UniversalOrder.am is open

  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
//2.Click <Our Partner> Link From menu list
  UniversalOrderPartnersPage partners=home.goToPartners();
 Thread.sleep(2000);

  @SuppressWarnings("deprecation")
 	WebDriverWait w = new WebDriverWait(driver,3);
   // presenceOfElementLocated condition
   
   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/partners/11.jpg']")));
//3.Verify that  <Libanan> partner picture is present
   Assert.assertTrue(driver.findElement(By.xpath("//img[@src='/img/partners/11.jpg']")).isDisplayed());
}
@Test
public void hyattJermukpartnerLinkTest() throws InterruptedException { 
//1.UniversalOrder.am is open

  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
//2.Click <Our Partner> Link From menu list
  UniversalOrderPartnersPage partners=home.goToPartners();
 Thread.sleep(2000);

  @SuppressWarnings("deprecation")
 	WebDriverWait w = new WebDriverWait(driver,3);
   // presenceOfElementLocated condition
   
   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/partners/18.jpg']")));
//3.Verify tha<HYATT JERMUK> partner picture is present
   Assert.assertTrue(driver.findElement(By.xpath("//img[@src='/img/partners/18.jpg']")).isDisplayed());
}
@Test
public void lorangeCafeteriapartnerLinkTest() throws InterruptedException { 
//1.UniversalOrder.am is open

  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
//2.Click <Our Partner> Link From menu list
  UniversalOrderPartnersPage partners=home.goToPartners();
 Thread.sleep(2000);

  @SuppressWarnings("deprecation")
 	WebDriverWait w = new WebDriverWait(driver,3);
   // presenceOfElementLocated condition
   
   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/partners/21.jpg']")));
//3.Verify tha<LORANGE CAFETERIA> partner picture is present
   Assert.assertTrue(driver.findElement(By.xpath("//img[@src='/img/partners/21.jpg']")).isDisplayed());
}
@Test
public void araratHallpartnerLinkTest() throws InterruptedException { 
//1.UniversalOrder.am is open

  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
//2.Click <Our Partner> Link From menu list
  UniversalOrderPartnersPage partners=home.goToPartners();
 Thread.sleep(2000);

  @SuppressWarnings("deprecation")
 	WebDriverWait w = new WebDriverWait(driver,3);
   // presenceOfElementLocated condition
   
   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/partners/22.jpg']")));
//3.Verify tha<Ararat Hall> partner picture is present
   Assert.assertTrue(driver.findElement(By.xpath("//img[@src='/img/partners/22.jpg']")).isDisplayed());
}
@Test
public void brazilianPioneerpartnerLinkTest() throws InterruptedException { 
//1.UniversalOrder.am is open

  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
//2.Click <Our Partner> Link From menu list
  UniversalOrderPartnersPage partners=home.goToPartners();
 Thread.sleep(2000);

  @SuppressWarnings("deprecation")
 	WebDriverWait w = new WebDriverWait(driver,3);
   // presenceOfElementLocated condition
   
   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/partners/24.jpg']")));
//3.Verify tha<Brazilian Pioneer Restaurant> partner picture is present
   Assert.assertTrue(driver.findElement(By.xpath("//img[@src='/img/partners/24.jpg']")).isDisplayed());
}

}