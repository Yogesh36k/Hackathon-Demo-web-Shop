package hackthon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterationPage {
	WebDriver driver;
	
	 RegisterationPage(WebDriver driver) {
		this.driver=driver;
	}
	 By Goregister=By.xpath("//a[@class='ico-register']");
	 By ClickMale=By.id("gender-male");
	 By inputfsName=By.id("FirstName");
	 By inputlsName=By.id("LastName");
	 By inputEmail=By.id("Email");
	 By inputPassword=By.id("Password");
	 By inputConfromPass=By.id("ConfirmPassword");
	 By ClickRigster=By.id("register-button");
	 By Continuebutton=By.xpath("//input[@class='button-1 register-continue-button']");
	 
	 
	 public void Registerbutton() {
		 driver.findElement(Goregister).click();
		 
	 }
	 public void Male() {
		 driver.findElement(ClickMale).click();
	 }
	 public void NameField(String fsname,String lsname) {
		 driver.findElement(inputfsName).sendKeys(fsname);
		 driver.findElement(inputlsName).sendKeys(lsname);
	 }
	 public void EmailField(String email) {
		 driver.findElement(inputEmail).sendKeys(email);
	 }
	 public void Passwordfield(String password,String ConPassword) {
		 driver.findElement(inputPassword).sendKeys(password);
		 driver.findElement(inputConfromPass).sendKeys(ConPassword);
	 }
	 public void RegisterbuttonClick() {
		 driver.findElement(ClickRigster).click();
	 }
	 public void ContinueClick() {
		 driver.findElement(Continuebutton).click();
	 }

}
