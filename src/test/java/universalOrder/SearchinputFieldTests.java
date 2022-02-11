package universalOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import com.web365.universalorder.am.page.home.UniversalOrderHomePage;
import com.web365.universalorder.am.page.productList.UniversalOrderParakombiOvensPage;

import universalOrder.base.UniversalOrderBaseTest;

public class SearchinputFieldTests extends UniversalOrderBaseTest {
	@Test
	 public void searchFieldtest1() throws InterruptedException {
//1.Universalorder.am page is open
		  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
		  Thread.sleep(5000);
		  @SuppressWarnings("deprecation")
		 	WebDriverWait w = new WebDriverWait(driver,3);
		   // presenceOfElementLocated condition
		   
		   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//div[@class='search']//input[@type='text']")));
//2. Type Armenian letters In search input field 
	home.fillInSearch("Սառնարաններ");
		Thread.sleep(5000);
//3.Click on "Որոնել" button
		UniversalOrderHomePage searchField= home.searchClick();
		home = home.logoClick();
}
	@Test
	 public void searchFieldtest2() throws InterruptedException {
//1.Universalorder.am page is open
		  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
		  Thread.sleep(5000);
		  @SuppressWarnings("deprecation")
		 	WebDriverWait w = new WebDriverWait(driver,3);
		   // presenceOfElementLocated condition
		   
		   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//div[@class='search']//input[@type='text']")));
//2. Type Russian letters In search input field 
	home.fillInSearch("Пароконвектоматы");
		Thread.sleep(5000);
//3.Click on "Որոնել" button
		UniversalOrderParakombiOvensPage paracombi = new UniversalOrderParakombiOvensPage(driver);
	home.searchClick();
		
		home = home.logoClick();
}
	@Test
	 public void searchFieldtest3() throws InterruptedException {
//1.Universalorder.am page is open
		  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
		  Thread.sleep(5000);
		  @SuppressWarnings("deprecation")
		 	WebDriverWait w = new WebDriverWait(driver,3);
		   // presenceOfElementLocated condition
		   
		   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//div[@class='search']//input[@type='text']")));
//2. Type English letters In search input field 
	home.fillInSearch("paracombi");
		Thread.sleep(5000);
//3.Click on "Որոնել" button
		UniversalOrderParakombiOvensPage paracombi = new UniversalOrderParakombiOvensPage(driver);
	home.searchClick();
		
		home = home.logoClick();
}

}