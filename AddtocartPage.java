package hackthon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class AddtocartPage {
	
	WebDriver driver;
	
	public AddtocartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By digital=By.xpath("(//a[@href='/digital-downloads'])[1]");
	
    By PriceFilter=By.id("products-orderby");
    
    By Addtocatbutton=By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[1]");
    By Addtocatbutton1=By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[2]");
  
    
    By shopingbutton= By.linkText("Shopping cart");
    
    
    public void DigitalDownload() {
    	driver.findElement(digital).click();
    }
    public void PriceFilterApply() {
    	WebElement price=driver.findElement(PriceFilter);
    	Select select=new Select(price);
    	select.selectByIndex(4);
    	
    	}
    public void AddtocatClick() {
    	driver.findElement(Addtocatbutton).click();
    	
    }
    public void Addtocartclick1() {
    	driver.findElement(Addtocatbutton1).click();
    }
    
    public void ShopingbiuttonClick() {
    	
    	driver.findElement(shopingbutton).click();
    }
    
}
