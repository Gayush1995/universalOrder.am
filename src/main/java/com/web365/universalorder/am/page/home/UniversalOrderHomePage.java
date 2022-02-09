package com.web365.universalorder.am.page.home;

import static com.web365.universalorder.am.page.home.UniversalOrderHomePageConstats.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.universalorder.am.page.base.UniversalOrderBasePage;
import com.web365.universalorder.am.page.footerPartLinks.GoogleMapPage;
import com.web365.universalorder.am.page.footerPartLinks.UniversalOrderSendingEmailPage;
import com.web365.universalorder.am.page.menu.UniversalOrderAboutUsPage;
import com.web365.universalorder.am.page.menu.UniversalOrderContactsPage;
import com.web365.universalorder.am.page.menu.UniversalOrderPartnersPage;
import com.web365.universalorder.am.page.menu.UniversalOrderServicesPage;
import com.web365.universalorder.am.page.ourPartners.UniversalOrderBeelinePartnerPage;
import com.web365.universalorder.am.page.productList.UniversalOrderOvensProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderKettlesAndCountertopFryersProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderMiniDistributionLineProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderBoilersPage;
import com.web365.universalorder.am.page.productList.UniversalOrderContactProcessingApparatusProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderConvectionOvensPage;
import com.web365.universalorder.am.page.productList.UniversalOrderDishwashersProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderDistributionOfLineASTAProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderDistributionOfLinePATSHAProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderDistributionOfLinePREMERProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderElectromechanicalProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderElectronicStovesProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderGasEquipmentProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderInductionCookersProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderParakombiOvensPage;
import com.web365.universalorder.am.page.productList.UniversalOrderPizzaOvensProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderProofingCabinetsAndChambersProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderRefrigeratedCabinetsProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderRotaryOvensProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderSelfServiceLineProductsPage;
import com.web365.universalorder.am.page.productList.UniversalOrderShockFreezingGeneratorsProductsPage;
import com.web365.universalorder.am.page.productList.UniversalorderAccessoriesProductsPage;
import com.web365.universalorder.am.page.productList.UniversalorderBarsProductsPage;
import com.web365.universalorder.am.page.productList.UniversalorderDesktopShowcaseProductsPage;
import com.web365.universalorder.am.page.productList.UniversalorderNeutralEquipmentProductsPage;
import com.web365.universalorder.am.page.productList.UniversalorderRefrigeratedTablesProductsPage;
import com.web365.universalorder.am.page.productList.UniversalorderSpecialEquipmentProductsPage;
public class UniversalOrderHomePage extends UniversalOrderBasePage {
	
	

	public UniversalOrderHomePage(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
		
	}
	
	@FindBy(xpath=LOGO_XPATH)
   public WebElement logo;
	
	@FindBy(xpath = SHOP_CART_XPATH)
	 public WebElement shopCart;
	
	@FindBy(xpath=ABOUT_US_LINK_XPATH)
	public WebElement aboutUsLink;
	
	@FindBy(xpath=SERVICES_XPATH)
	public WebElement serviceslink;
	
	@FindBy(xpath=PARTNERS_XPATH)
	public WebElement partnerslink;
	
	@FindBy(xpath=CONTACTS_XPATH)
	public WebElement contactslink;
	
	@FindBy(xpath=PARACOMBI_OVENS_XPATH)
	public WebElement paracombiProductLink;

	@FindBy(xpath=CONVECTION_OVENS_XPATH)
	public WebElement convectionOvensLink;

	
	@FindBy(xpath=BOILERS_XPATH)
	public WebElement boilersProductLink;
	
	@FindBy(xpath=DISHWASHERS_XPATH)
	public WebElement dishwashersproductLink;
	

	@FindBy(xpath=ELECTROMECHANICAL_EQUIPMENT_XPATH)
	public WebElement electromechanicalproducsLink;
	
  @FindBy(xpath=ROTARY_OVENS_XPATH)
	public WebElement rotaryOvensLink;
	
  
  @FindBy(xpath=SHOCK_FREEZING_GENERATORS_XPATH)
	public WebElement shockfreezinggeneratorsLink;
  
  @FindBy(xpath=REFRIGERATED_CABINETS_XPATH)
 	public WebElement refrigeratedCabinetsLink;
	
  @FindBy(xpath=CONTACT_PROCESSING_APPARATUS_XPATH)
	public WebElement contactprocessingApparatusLink;
  
   @FindBy(xpath= ELECTRIC_STOVES_XPATH)
	public WebElement electronicstovesProductLink;
  
 
   @FindBy(xpath=INDUCTION_COOKERS_XPATH)
  	public WebElement inductionCookersProductLink;
    
   @FindBy(xpath=GAS_EQUIPMENT_XPATH)
 	public WebElement gasequipmentProductLink;
   
    @FindBy(xpath=PIZZA_OVENS_XPATH)
	public WebElement pizzaOvensProductLink;
   
    @FindBy(xpath=OVENS_XPATH)
	public WebElement ovensProductLink;
    
    @FindBy(xpath=PROOFING_CABINETS_AND_CHAMBERS_XPATH)
	public WebElement proofingCabinetsAndChambersProductLink;
    
   @FindBy(xpath=KETTLES_AND_COUNTERTOP_FRYERS_XPATH)
	public WebElement kettlesAndCountertopFryersProductLink;
   
   @FindBy(xpath=MINI_DISTRIBUTION_LINE_XPATH)
	public WebElement miniDistributionLineProductLink;
   
   @FindBy(xpath=DISTRIBUTION_OF_LINE_ASTA_XPATH)
	public WebElement distributionOfLineASTAProductLink;
    
   @FindBy(xpath=DISTRIBUTION_OF_LINE_PATSHA__XPATH)
	public WebElement distributionOfLinePatshaProductLink;
   
   @FindBy(xpath=DISTRIBUTION_OF_LINE_PREMER_XPATH)
	public WebElement distributionOfLinePremerProductLink;
   
   @FindBy(xpath=SELF_SERVICE_LINE_XPATH)
	public WebElement selfServiceLineProductLink;
   
   @FindBy(xpath=BARS_XPATH)
	public WebElement barsProductLink;
  
   @FindBy(xpath=REFRIGERATED_TABLES_XPATH)
	public WebElement refrigeratedTablesProductLink;
   
   @FindBy(xpath=DESKTOP_SHOWCASE_XPATH)
  	public WebElement desktopShowcaseProductLink;
  
   @FindBy(xpath=NEUTRAL_EQUIPMENT_XPATH)
 	public WebElement neutralEquipmentProductLink;
   
   @FindBy(xpath=ACCESSORIES_XPATH)
	public WebElement accessoriesProductLink;
   
   @FindBy(xpath=SPECIAL_EQUIPMENT)
	public WebElement specialEquipmentProductLink;
   
   
   
   
   
   
   @FindBy(xpath=BEELINE_AM_XPATH)
	public WebElement beelinepartnerLink;

    @FindBy(xpath=EMAIL_INPUT_FIELD_XPATH)
   	public WebElement emailInputField;
   
    @FindBy(xpath=SEND_BUTTON_XPATH)
   	public WebElement sendButton;
  
    @FindBy(xpath=PHONE_NUMBER_XPATH)
   	public WebElement phoneNumber;
    
    @FindBy(xpath=ADDRESS_XPATH)
   	public WebElement address;
    
    @FindBy(xpath=EMAIL_ADDRESS_XPATH)
   	public WebElement emailAddress;
   
    @FindBy(xpath=FIND_US_ON_GOOGLEMAP_XPATH)
   	public WebElement findUsOnGoogleMap;
    
    
    
    
    
    
    
    
    public UniversalOrderHomePage logoClick() {
		logo.click();
		return new UniversalOrderHomePage(this.driver);
	}
	public UniversalOrderAboutUsPage goToAboutUs() {
		aboutUsLink.click();
		return new UniversalOrderAboutUsPage(this.driver);
	}
	public UniversalOrderServicesPage goToServices() {
		serviceslink.click();
		return new UniversalOrderServicesPage(this.driver);
	}
	public UniversalOrderPartnersPage goToPartners() {
		partnerslink.click();
		return new UniversalOrderPartnersPage(this.driver);
}
	public UniversalOrderContactsPage goToContacts() {
		contactslink.click();
		return new UniversalOrderContactsPage(this.driver);

	}
	public UniversalOrderParakombiOvensPage goToParacombiOvenProductList() {
		paracombiProductLink.click();
		return new UniversalOrderParakombiOvensPage(this.driver);
	}
  public UniversalOrderConvectionOvensPage goToConvectionOvensProductList() {
	convectionOvensLink.click();
	return new UniversalOrderConvectionOvensPage(this.driver);
}
  public UniversalOrderBoilersPage goToBoliersProductList () {
	  boilersProductLink.click();
	return new UniversalOrderBoilersPage(this.driver);
}
  public UniversalOrderDishwashersProductsPage goToDishwasherProductsList  () {
	  dishwashersproductLink.click();
	return new UniversalOrderDishwashersProductsPage(this.driver);
}
  public UniversalOrderElectromechanicalProductsPage goToElectromechanicalProductsList  () {
	  electromechanicalproducsLink.click();
	return new UniversalOrderElectromechanicalProductsPage(this.driver);
}
  public UniversalOrderRotaryOvensProductsPage goToRotaryOvensProductsList  () {
	  rotaryOvensLink.click();
	return new UniversalOrderRotaryOvensProductsPage(this.driver);
  }
public UniversalOrderShockFreezingGeneratorsProductsPage goToShockFreezingGeneratorsProductsList  () {
	shockfreezinggeneratorsLink.click();
	return new UniversalOrderShockFreezingGeneratorsProductsPage(this.driver);
}
public UniversalOrderRefrigeratedCabinetsProductsPage goToRefrigeratedCabinetsProductsList  () {
	refrigeratedCabinetsLink.click();
	return new UniversalOrderRefrigeratedCabinetsProductsPage(this.driver);
}
public UniversalOrderContactProcessingApparatusProductsPage goToContactProcessingApparatusProductsList  () {
	contactprocessingApparatusLink.click();
	return new UniversalOrderContactProcessingApparatusProductsPage(this.driver);
}
public UniversalOrderElectronicStovesProductsPage goToElectronicStovesProductsList  () {
	electronicstovesProductLink.click();
	return new UniversalOrderElectronicStovesProductsPage(this.driver);
}
public UniversalOrderInductionCookersProductsPage goToInductionCookersProductsList  () {
	inductionCookersProductLink.click();
	return new UniversalOrderInductionCookersProductsPage(this.driver);
}
public UniversalOrderGasEquipmentProductsPage goToGasEquipmentProductsList  () {
	gasequipmentProductLink.click();
	return new UniversalOrderGasEquipmentProductsPage(this.driver);
}
public UniversalOrderPizzaOvensProductsPage goToPizzaOvensProductsList  () {
	pizzaOvensProductLink.click();
	return new UniversalOrderPizzaOvensProductsPage(this.driver);
}
public UniversalOrderOvensProductsPage goToOvensProductsList  () {
	ovensProductLink.click();
	return new UniversalOrderOvensProductsPage(this.driver);
}
public UniversalOrderProofingCabinetsAndChambersProductsPage goToProofingCabinetsAndChambersProductsList  () {
	proofingCabinetsAndChambersProductLink.click();
	return new UniversalOrderProofingCabinetsAndChambersProductsPage(this.driver);
}
public UniversalOrderKettlesAndCountertopFryersProductsPage goToKettlesAndCountertopFryersProductsList  () {
	kettlesAndCountertopFryersProductLink.click();
	return new UniversalOrderKettlesAndCountertopFryersProductsPage(this.driver);
}
public UniversalOrderMiniDistributionLineProductsPage goToMiniDistributionLineProductList  () {
	miniDistributionLineProductLink.click();
	return new UniversalOrderMiniDistributionLineProductsPage(this.driver);
}
public UniversalOrderDistributionOfLineASTAProductsPage goTodistributionOfLineASTAPProductList  () {
	distributionOfLineASTAProductLink.click();
	return new UniversalOrderDistributionOfLineASTAProductsPage(this.driver);
}
public UniversalOrderDistributionOfLinePATSHAProductsPage goTodistributionOfLinePATSHAProductList  () {
	distributionOfLinePatshaProductLink.click();
	return new UniversalOrderDistributionOfLinePATSHAProductsPage(this.driver);
}
public UniversalOrderDistributionOfLinePREMERProductsPage goTodistributionOfLinePREMERProductList  () {
	distributionOfLinePremerProductLink.click();
	return new UniversalOrderDistributionOfLinePREMERProductsPage(this.driver);
}
public UniversalOrderSelfServiceLineProductsPage goToSelfServiceLineProductList  () {
	selfServiceLineProductLink.click();
	return new UniversalOrderSelfServiceLineProductsPage(this.driver);
}
public UniversalorderBarsProductsPage goToBarsProductList () {
	barsProductLink.click();
	return new UniversalorderBarsProductsPage(this.driver);
}
public UniversalorderRefrigeratedTablesProductsPage goToRefrigeratedTablesProductList () {
	refrigeratedTablesProductLink.click();
	return new UniversalorderRefrigeratedTablesProductsPage(this.driver);
}
public UniversalorderDesktopShowcaseProductsPage goToDesktopShowcaseProductList () {
	desktopShowcaseProductLink.click();
	return new UniversalorderDesktopShowcaseProductsPage(this.driver);
}
public UniversalorderNeutralEquipmentProductsPage goToNeutralEquipmentProductList () {
	neutralEquipmentProductLink.click();
	return new UniversalorderNeutralEquipmentProductsPage(this.driver);
}
public UniversalorderAccessoriesProductsPage goToAccessoriesProductList () {
	accessoriesProductLink.click();
	return new UniversalorderAccessoriesProductsPage(this.driver);
}
public UniversalorderSpecialEquipmentProductsPage goToSpecialEquipmentProductList () {
	specialEquipmentProductLink.click();
	return new UniversalorderSpecialEquipmentProductsPage(this.driver);
}















public UniversalOrderBeelinePartnerPage goToUniversalOrderBeelinePartnerPageClick  () {
	beelinepartnerLink.click();
	return new UniversalOrderBeelinePartnerPage(this.driver);
}
   public void fillInEmail(String email) {
	   emailInputField.sendKeys(email);
   }
  
public UniversalOrderSendingEmailPage  goToUniversalOrderSendingEmailPageClick  () {
	sendButton.click();
	return new UniversalOrderSendingEmailPage(this.driver);
}
public GoogleMapPage  goToGoogleMapPageClick  () {
	findUsOnGoogleMap.click();
	return new GoogleMapPage(this.driver);
}

}