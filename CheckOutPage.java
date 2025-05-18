package hackthon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class CheckOutPage {
	private static final WebElement StateSelectOur = null;
	WebDriver driver;
	
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By Shopingbutton=By.linkText("Shopping cart");
	By Termandcodetion=By.id("termsofservice");
	By CheckOut=By.id("checkout");
	By compnyAdd=By.id("BillingNewAddress_Company");
	By CountrySelect=By.id("BillingNewAddress_CountryId");
	By StateSlect=By.id("BillingNewAddress_StateProvinceId");
	By Cityname=By.id("BillingNewAddress_City");
	By Addressfill1=By.id("BillingNewAddress_Address1");
	By Addressfill2=By.id("BillingNewAddress_Address2");
	By ZippostFill=By.id("BillingNewAddress_ZipPostalCode");
	By Mobilenumber=By.id("BillingNewAddress_PhoneNumber");
	By Flexnumber=By.id("BillingNewAddress_FaxNumber");
	By ContinueButton=By.xpath("//input[@class='button-1 new-address-next-step-button']");
	By Payment=By.id("paymentmethod_1");
	By PaymentContinue=By.xpath("//input[@class='button-1 payment-method-next-step-button']");
	By PaymentInformation=By.xpath("//input[@class='button-1 payment-info-next-step-button']");
	By Orderconformation=By.xpath("//input[@class='button-1 confirm-order-next-step-button']");
	By OrderInformation=By.linkText("Click here for order details.");
	
	
	public void ShopingbuttonClick() {
		driver.findElement(Shopingbutton).click();
	}
	
	public void CheckOutClick() {
		driver.findElement(Termandcodetion).click();
		driver.findElement(CheckOut).click();
	}
	public void BlingAddress(String comp) {
		driver.findElement(compnyAdd).sendKeys("comp");
		WebElement ContrySelect=driver.findElement(CountrySelect);
		Select select=new Select(ContrySelect);
		select.selectByIndex(41);
		
		WebElement StateSlectOur=driver.findElement(StateSlect);
		Select select1=new Select(StateSlectOur);
		select1.selectByIndex(0);
		
		
	}
	public void EnterCityname(String cityname,String Address1,String address2) {
		driver.findElement(Cityname).sendKeys(cityname);
        driver.findElement(Addressfill1).sendKeys(Address1);
		driver.findElement(Addressfill2).sendKeys(address2);
	}
	public void OtherDetail(String Zipfill,String Mobilenumberfill,String Flexfill) {
		driver.findElement(ZippostFill).sendKeys(Zipfill);
		driver.findElement(Mobilenumber).sendKeys(Mobilenumberfill);
		driver.findElement(Flexnumber).sendKeys(Flexfill);
		
	}
   public void continueClick() {
	   driver.findElement(ContinueButton).click();
   }
   public void PaymentMethod() {
	   driver.findElement(Payment).click();
	   driver.findElement(PaymentContinue).click();
   }
   public void Information() {
	   driver.findElement(PaymentInformation).click();
   }
   public void OrderConformation() {
	   driver.findElement(Orderconformation).click();
   }
   public void OrderInformation() {
	   driver.findElement(OrderInformation).click();
   }
}
