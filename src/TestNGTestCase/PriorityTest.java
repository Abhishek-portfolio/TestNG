package TestNGTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityTest {
	WebDriver driver;
	
	@BeforeTest
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhishek\\OneDrive\\Desktop\\Selenium Drivers\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://bstackdemo.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void TestTitle () {
		System.out.println("TestTitile Chrome is:"+ Thread.currentThread().getId());
		Assert.assertEquals(driver.getTitle(), "StackDemo");
	}
	
	@Test(priority =2)
	public void ClickOffers() throws InterruptedException {
		WebElement Offers = driver.findElement(By.id("offers"));
		Offers.click();
		Thread.sleep(2000);
		WebElement LoginBtn = driver.findElement(By.id("login-btn"));
		LoginBtn.click();
	}
	
	@Test(priority =3)
	public void clickOrders() throws InterruptedException {
		driver.navigate().to("https://bstackdemo.com/");
		WebElement Orders = driver.findElement(By.id("orders"));
		Orders.click();
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.id("login-btn"));
		loginButton.click();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	
}
