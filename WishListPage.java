package hackthon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage {

	WebDriver driver;
	
	public WishListPage(WebDriver driver) {
		
	this.driver=driver;
	
	}
	
	By Searchinput=By.id("small-searchterms");
	By Searchbutton=By.xpath("//input[@class='button-1 search-box-button']");
	By ClickBook=By.xpath("//img[@alt='Picture of Fiction EX']");
	By addtowishlist=By.id("add-to-wishlist-button-78");
	
	By BookClick=By.linkText("Books");
	By ClickHealthbook=By.xpath("//img[@alt='Picture of Health Book']");
	By addtowishlist1=By.id("add-to-wishlist-button-22");
	
	public void searchbar(String text) {
		driver.findElement(Searchinput).sendKeys(text);
		driver.findElement(Searchbutton).click();
	}
	public void BookAdd() {
		driver.findElement(ClickBook).click();
		driver.findElement(addtowishlist).click();
	}
	public void Gotonavbarbook() {
		driver.findElement(BookClick).click();
		driver.findElement(ClickHealthbook).click();
		driver.findElement(addtowishlist1).click();
		
	}
	
}
