package TestNGTestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Suite {
	WebDriver driver;
	long StartTime;
	long EndTime;
	
	@BeforeSuite
	public void LaunchBrowser( ) {
		System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhishek\\OneDrive\\Desktop\\Selenium Drivers\\ChromeDriver\\chromedriver-win64\\chromedriver.exe"); 
		driver = new ChromeDriver();	
	}
	@Test
	public void OpenGoogle() {
		driver.get("https://www.google.com/");	
	}
	@Test
	public void OpenYoutube() {
		driver.get("https://www.youtube.com/");	
	}
	@Test
	public void OpenFacebook() {
		driver.get("https://www.facebook.com/");	
	}
	@AfterSuite
	public void CloseBrowser() {
		driver.quit();
		System.currentTimeMillis();
		long TotalTime = EndTime - StartTime;
		System.out.println("Total Time Taken:"+TotalTime);
	}
}

