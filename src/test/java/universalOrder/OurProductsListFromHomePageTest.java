package universalOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.universalorder.am.page.home.UniversalOrderHomePage;

import com.web365.universalorder.am.page.productList.UniversalOrderBoilersPage;
import com.web365.universalorder.am.page.productList.UniversalOrderCanopyProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderContactProcessingApparatusProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderConvectionOvensPage;
import com.web365.universalorder.am.page.productList.UniversalOrderDishwashersProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderElectromechanicalProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderElectronicStovesProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderGasEquipmentProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderInductionCookersProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderOvensProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderParakombiOvensPage;
import com.web365.universalorder.am.page.productList.UniversalOrderPizzaOvensProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderProofingCabinetsAndChambersProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderRefrigeratedCabinetsProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderRotaryOvensProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderShockFreezingGeneratorsProductsPage;

import universalOrder.base.UniversalOrderBaseTest;

public class OurProductsListFromHomePageTest extends UniversalOrderBaseTest {
	
	
@Test
public void paracombiproductTest() throws InterruptedException { //Пароконвектоматы
//1.UniversalOrder.am is open
	UniversalOrderParakombiOvensPage paracombi = new UniversalOrderParakombiOvensPage(driver);
	UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
	Thread.sleep(2000);
//2.Click on Пароконвектоматы Link
  paracombi=home.goToParacombiOvenProductList();

  @SuppressWarnings("deprecation")
	WebDriverWait w1 = new WebDriverWait(driver,3);
// presenceOfElementLocated condition

w1.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1430/475.jpg']")));
 
Assert.assertTrue(paracombi.paracombiovensproducts.isDisplayed());
   home = home.logoClick();
}

@Test
public void convectionproductsTest() throws InterruptedException { //Конвекционные Печи
//1.UniversalOrder.am is open
	UniversalOrderConvectionOvensPage convectionproducts = new UniversalOrderConvectionOvensPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
 //2.Click on Конвекционные Печи Link
  convectionproducts=home.goToConvectionOvensProductList();

  @SuppressWarnings("deprecation")
 	WebDriverWait w = new WebDriverWait(driver,3);
   // presenceOfElementLocated condition
   
   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1431/476.jpg']")));
  Assert.assertTrue(convectionproducts.convectionpageverifyxpath.isDisplayed());
  home = home.logoClick();
}
@Test
public void boilersproductsTest() throws InterruptedException { //Котлы
//1.UniversalOrder.am is open
	UniversalOrderBoilersPage boilersproducts = new UniversalOrderBoilersPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
 //2. Click on Котлы Link
  boilersproducts=home.goToBoliersProductList();
@SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
  // presenceOfElementLocated condition
   w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1432/480.jpg']")));
  Assert.assertTrue(boilersproducts.boilerspageverifyxpath.isDisplayed());
  home = home.logoClick();
  
}
@Test
public void dishwasherProductsTest() throws InterruptedException { //Посудомоечные Машины
//1.UniversalOrder.am is open
	UniversalOrderDishwashersProductsPage dishwasherproducts = new UniversalOrderDishwashersProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on Посудомоечные Машины Link
  dishwasherproducts=home.goToDishwasherProductsList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
 // presenceOfElementLocated condition
  w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1433/484.jpg']")));
  Assert.assertTrue(dishwasherproducts.dishwasherPageVerify.isDisplayed());
  home = home.logoClick();
}
@Test
public void electromechanicalProductsTest() throws InterruptedException { //Электромеханическое Оборудование
//1.UniversalOrder.am is open
	UniversalOrderElectromechanicalProductsPage electromechanicalproducts = new UniversalOrderElectromechanicalProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on Электромеханическое Оборудование Link
  electromechanicalproducts=home.goToElectromechanicalProductsList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
// presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1434/488.jpg']")));
  Assert.assertTrue(electromechanicalproducts.electromechanicalProductPageVerify.isDisplayed());
home = home.logoClick();
}
@Test
public void roteryOvensProductsTest() throws InterruptedException { //Ротационные Пекарские Шкафы
//1.UniversalOrder.am is open
	UniversalOrderRotaryOvensProductsPage roteryOvensproducts = new UniversalOrderRotaryOvensProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on Ротационные Пекарские Шкафы Link
  roteryOvensproducts=home.goToRotaryOvensProductsList();
 @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition

w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1435/492.jpg']")));
  Assert.assertTrue(roteryOvensproducts.roteryOvensProductPageVerify.isDisplayed());
  home = home.logoClick();
}
@Test
public void shockFreezingGeneratorsProductsList() throws InterruptedException { //Шоковая Заморозка, Льдогенераторы
//1.UniversalOrder.am is open
	UniversalOrderShockFreezingGeneratorsProductsPage shockfreezinggeneratorsproducts = new UniversalOrderShockFreezingGeneratorsProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on Шоковая Заморозка, Льдогенераторы Link
  shockfreezinggeneratorsproducts=home.goToShockFreezingGeneratorsProductsList();
@SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition

w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1436/495.jpg']")));
  Assert.assertTrue(shockfreezinggeneratorsproducts.shockfreezinggenerationpageverifyxpath.isDisplayed());
  home = home.logoClick();
}
@Test
public void refrigeratedCabinetsProductsList() throws InterruptedException { //Холодильные Шкафы
//1.UniversalOrder.am is open
	UniversalOrderRefrigeratedCabinetsProductsPage refrigeratedCabinetsProductsList = new UniversalOrderRefrigeratedCabinetsProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on Холодильные Шкафы Link
  refrigeratedCabinetsProductsList=home.goToRefrigeratedCabinetsProductsList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1437/497.jpg']")));
  Assert.assertTrue(refrigeratedCabinetsProductsList.refrigiratedCabinetsPageVerify.isDisplayed());
  home = home.logoClick();
}
@Test
public void contactProcessingApparatusProductsList() throws InterruptedException { //Сковороды и Аппараты Контактной Обработки
//1.UniversalOrder.am is open
	UniversalOrderContactProcessingApparatusProductsPage contactProcessingApparatusProductsList = new UniversalOrderContactProcessingApparatusProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on Сковороды и Аппараты Контактной Обработки Link
  contactProcessingApparatusProductsList = home.goToContactProcessingApparatusProductsList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1438/500.jpg']")));
  Assert.assertTrue(contactProcessingApparatusProductsList.contactProcessingApparatusPageVerify.isDisplayed());
 home = home.logoClick();
}
@Test
public void electronicStovesProductsList() throws InterruptedException { //Электрические Плиты
//1.UniversalOrder.am is open
	UniversalOrderElectronicStovesProductsPage electronicStovesProductsList = new UniversalOrderElectronicStovesProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on Электрические Плиты Link
  electronicStovesProductsList = home.goToElectronicStovesProductsList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1439/504.jpg']")));
  Assert.assertTrue(electronicStovesProductsList.electronicStovesPageVerify.isDisplayed());
 home = home.logoClick();
}
@Test
public void inductionCookersProductsList() throws InterruptedException { ////Индукционные Плиты
//1.UniversalOrder.am is open
	UniversalOrderInductionCookersProductsPage inductionCookersProductsList = new UniversalOrderInductionCookersProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on Индукционные Плиты Link
  inductionCookersProductsList = home.goToInductionCookersProductsList();
   home = home.logoClick();
}
@Test
public void gasEquipmentProductsList() throws InterruptedException { //Газовое Оборудование
//1.UniversalOrder.am is open
	UniversalOrderGasEquipmentProductsPage gasEquipmentProductsList = new UniversalOrderGasEquipmentProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on Газовое Оборудование Link
  gasEquipmentProductsList = home.goToGasEquipmentProductsList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1441/506.jpg']")));
  Assert.assertTrue(gasEquipmentProductsList.gasEquipmentPageVerify.isDisplayed());
 home = home.logoClick();
}
@Test
public void pizzaOvensProductsList() throws InterruptedException { //Печи Для Пиццы
//1.UniversalOrder.am is open
	UniversalOrderPizzaOvensProductsPage pizzaOvensProductsList = new UniversalOrderPizzaOvensProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on Печи Для Пиццы Link
  pizzaOvensProductsList = home.goToPizzaOvensProductsList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1445/541.jpg']")));
  Assert.assertTrue(pizzaOvensProductsList.pizzaOvensPageVerify.isDisplayed());
 home = home.logoClick();
}
@Test
public void ovensProductsList() throws InterruptedException { //Шкафы Пекарские и Жарочные
//1.UniversalOrder.am is open
	UniversalOrderOvensProductsPage ovensProductsList = new UniversalOrderOvensProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on Шкафы Пекарские и Жарочные Link
  ovensProductsList = home.goToOvensProductsList();
  @SuppressWarnings("deprecation")
	WebDriverWait w = new WebDriverWait(driver,3);
//presenceOfElementLocated condition
w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//img[@src='/img/cats/1446/543.jpg']")));
  Assert.assertTrue(ovensProductsList.ovenspageverify.isDisplayed());
 home = home.logoClick();
}
@Test
public void proofingCabinetsAndChambersProductsLink() throws InterruptedException { //Расстоечные Шкафы и Камеры
//1.UniversalOrder.am is open
	UniversalOrderProofingCabinetsAndChambersProductsPage proofingCabinetsAndChambersProductsLink = new UniversalOrderProofingCabinetsAndChambersProductsPage(driver);
  UniversalOrderHomePage home = new UniversalOrderHomePage(driver);
  Thread.sleep(2000);
//2.Click on Расстоечные Шкафы и Камеры Link
  proofingCabinetsAndChambersProductsLink = home.goToProofingCabinetsAndChambersProductsList();
 home = home.logoClick();
}
}