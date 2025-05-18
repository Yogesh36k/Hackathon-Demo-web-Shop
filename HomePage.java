package hackthon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class HomePage {
   
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By logo=By.xpath("//div[@class='header-logo']");
	By Register=By.xpath("//a[@class='ico-register']");
	By banner=By.xpath("//img[@class='nivo-main-image']");
	
	
	
	public void TitleandUrl() {
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/");
	}
	public void Logocheck() {
		WebElement Logo=driver.findElement(logo);
		Assert.assertTrue(Logo.isDisplayed());
	}
	public void TextRegister() {
		WebElement Registervisible=driver.findElement(Register);
		Assert.assertTrue(Registervisible.isDisplayed());
	}
	public void Bannervisible() {
		WebElement Banner=driver.findElement(banner);
		Assert.assertTrue(Banner.isDisplayed());
	}
}
