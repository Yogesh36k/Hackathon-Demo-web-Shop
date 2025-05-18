package hackthon;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class AllPageRunner {
	
	ExtentReports extent;
	ExtentTest test;
	
	WebDriver driver;
	RegisterationPage registeration;
	AddtocartPage addtocart;
	CheckOutPage checkOut;
	HomePage homepage;
	WishListPage wishlistpage;
	
	@BeforeClass
	void setup() {
		
		ExtentSparkReporter spark=new ExtentSparkReporter("ExtentReportDemoWebShop.html");
		extent=new ExtentReports();
		extent.attachReporter(spark);
		
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
//		registeration=new RegisterationPage(driver);
		
		test=extent.createTest("Navigation Demo WebShop","Validate the Demo WebShop page");
		test.pass("Navigation to Demo Webshop page");
	}
	@Test(priority=1)
	void HomePage()throws InterruptedException {
		homepage=new HomePage(driver);
		Thread.sleep(2000);
//		homepage.TitleandUrl();
		Thread.sleep(2000);
		homepage.Logocheck();
		Thread.sleep(2000);
		homepage.TextRegister();
		Thread.sleep(2000);
		homepage.Bannervisible();
		test=extent.createTest("Home page Element visible");
		test.pass("Step 1 : Home page Element visible ");

	}
	@Test(priority=3)
	void WishListProduct()throws InterruptedException {
		wishlistpage=new WishListPage(driver);
		
		wishlistpage.searchbar("Fiction EX");
		Thread.sleep(2000);
		wishlistpage.BookAdd();
		Thread.sleep(2000);
		wishlistpage.Gotonavbarbook();
		Thread.sleep(2000);
	
		test=extent.createTest("User successfully add the product to wishList");
//		test.pass("Step 1 : User Search book succefully");
		test.pass("User successfully addd the book to wishlist");
	
		
	}
	
	
	@Test(priority=2)
	void RegisterUser()throws InterruptedException {
	
		registeration.Registerbutton();
		Thread.sleep(2000);
		registeration.Male();
		Thread.sleep(2000);
		registeration.NameField("Yogesh", "Kumar");
		Thread.sleep(2000);
		registeration.EmailField("yog4@gmail.com");
		Thread.sleep(2000);
		registeration.Passwordfield("12345678@", "12345678@");
		Thread.sleep(2000);
		registeration.RegisterbuttonClick();
		Thread.sleep(2000);
		registeration.ContinueClick();
		
		Thread.sleep(2000);
		test=extent.createTest("User successfully registered");
		test.pass("step 1 : user Successsfully registered ");

	}
		
	@Test(priority=4)
	void AddtocartProduct()throws InterruptedException {
		addtocart=new AddtocartPage(driver);
		
		addtocart.DigitalDownload();
		Thread.sleep(2000);
		addtocart.PriceFilterApply();
		Thread.sleep(2000);
		addtocart.AddtocatClick();
		Thread.sleep(2000);
		addtocart.Addtocartclick1();
		Thread.sleep(2000);
		addtocart.ShopingbiuttonClick();
		Thread.sleep(2000);
		test=extent.createTest("User successfully addthe product to cart");
		test.pass("step 1 :User successfully add the product to cart ");

	}
		
	@Test(priority=5)
	void CheckOutHole()throws InterruptedException {
		checkOut=new CheckOutPage(driver);
		
		checkOut.ShopingbuttonClick();
		Thread.sleep(2000);
		checkOut.CheckOutClick();
		Thread.sleep(2000);
		checkOut.BlingAddress("Masai");
		Thread.sleep(2000);
		checkOut.EnterCityname("Aligrah", "Muthar", "Kasganj");
		Thread.sleep(5000);
		checkOut.OtherDetail("324", "8979426789", "67899");
		Thread.sleep(5000);
		checkOut.continueClick();
		Thread.sleep(5000);
		checkOut.PaymentMethod();
		Thread.sleep(5000);
		checkOut.Information();
		Thread.sleep(5000);
		checkOut.OrderConformation();
		Thread.sleep(5000);
		checkOut.OrderInformation();
		Thread.sleep(5000);
		
		test=extent.createTest("User check the CheckOut process");
		test.pass("step 1: User check the Payment Method and Order Information");

	
	}
	
	
	@AfterClass
	void Teardown()throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		extent.flush();
	}
	
	

}
