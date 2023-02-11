package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	
	
public static WebDriver driver= null;
	
	@BeforeSuite
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();		
//		driver = new FirefoxDriver();
		
		String baseurl = "https://test.sharebus.co/";
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		
		//signup button
		driver.findElement(By.xpath("//button[@class='btn sb-btn-lg sb-btn-secondary rounded-pill py-1 px-3 fw-normal']")).click();
		
		//login
		driver.findElement(By.id("email")).sendKeys("brainstation23@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Pass@1234");
		driver.findElement(By.xpath("//button[@class='btn sb-btn-lg sb-btn-primary fw-bold rounded-pill w-100']")).click();
//		Thread.sleep(10000);
	}
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}
