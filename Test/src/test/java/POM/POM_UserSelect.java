package POM;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class POM_UserSelect{
	
	WebDriver d ;

	public POM_UserSelect(WebDriver driver) {

		d = driver;
		PageFactory.initElements(d, this);
		
	}
	
	By select_user = By.xpath("//span[@class='p-dropdown-trigger-icon pi pi-chevron-down']");
	
	By specific_user = By.xpath("//span[contains(text(),'Sharelead')]");
	
	By user_continue = By.xpath("//span[contains(text(),'Continue')]");
	
	By Setup_sharebus = By.xpath("//span[contains(text(),'Set up a Sharebus')]");
	
	
	public void User() throws InterruptedException {
		
		d.findElement(select_user).click();
		Thread.sleep(2000);
		
		d.findElement(specific_user).click();
		Thread.sleep(2000);
		
		d.findElement(user_continue).click();
		Thread.sleep(2000);
		
		d.findElement(Setup_sharebus).click();
		Thread.sleep(2000);
	}
	
	/*
	 * 
	 * 
	 */
	By from = By.id("startPoint");
	
	By to = By.id("destination");
	
	By dateClick = By.xpath("//input[@placeholder='Departure Date']");
	
	By timepick = By.xpath("(//input[@placeholder='Time'])[1]");
	
	By returndate = By.xpath("(//input[@placeholder='Return Date'])");
	
	By timepick2 = By.xpath("(//input[@placeholder='Time'])[3]");
	
	By timedetails_continue = By.cssSelector("button.sb-btn-primary span");
	
	By cookis = By.xpath("//button[@class='btn sb-btn-md sb-btn-primary text-white btn-sm ms-2']");
	
	
	
	
	public void Tripdetails() throws InterruptedException {
		
		d.findElement(cookis).click();
		Thread.sleep(2000);
		
		d.findElement(from).sendKeys("Oslo");
		Thread.sleep(2000);
		d.findElement(from).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		d.findElement(from).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor) d;
		js.executeScript("window.scrollTo(0,1000);");
		
		d.findElement(to).sendKeys("Kolbotn");
		Thread.sleep(2000);
		d.findElement(to).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		d.findElement(to).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		d.findElement(dateClick).clear();
		Thread.sleep(3000);

		d.findElement(dateClick).sendKeys("Friday, 24.03.2023"); // click calender
		Thread.sleep(3000);
		
		d.findElement(timepick).clear();
		Thread.sleep(3000);
		
		d.findElement(timepick).click();
		Thread.sleep(3000);
		
		d.findElement(returndate).clear();
		Thread.sleep(3000);
		
		d.findElement(returndate).sendKeys("Thursday, 30.03.2023"); // click calender
		Thread.sleep(3000);
		
		d.findElement(timepick2).clear();
		Thread.sleep(3000);
		
		d.findElement(timepick2).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
//		d.findElement(timedetails_continue).click();
//		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	
	By organization = By.xpath("//button[@class='btn yes-no-btn custom-border-radius bg-white border-light']");
	
	By team_arrow = By.xpath("//i[@class='fi fi-chevron-down']");
	
	By specific_team = By.xpath("//li[contains(text(),'NTNUI')]");
	
	By organization_continue = By.xpath("//span[contains(text(),'Continue')]");
	


	public void Organization() throws InterruptedException {
		// TODO Auto-generated method stub
		
		d.findElement(organization).click();
		Thread.sleep(2000);
		
		d.findElement(team_arrow).click();
		Thread.sleep(2000);
		
		d.findElement(specific_team).click();
		Thread.sleep(2000);
		
		d.findElement(organization_continue).click();
		Thread.sleep(2000);
		
	}
	
	
	
	
	By need_ticket = By.xpath("//button[@class='btn gray-white-bg ship-gray btn-discount-size rounded-end']");
	
	By ticket_discount = By.xpath("//button[@class='btn gray-white-bg ship-gray btn-discount-size rounded-end']");
	
	By create_sharebus = By.xpath("//span[contains(text(),'Create Sharebus')]");
	
	By share_publish = By.xpath("//span[contains(text(),'Publish')]");
	

	public void Passenger_goal() throws InterruptedException {
		// TODO Auto-generated method stub
		
		d.findElement(need_ticket).click();
		Thread.sleep(2000);
		
		d.findElement(ticket_discount).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) d;
		js.executeScript("window.scrollTo(0,500);");
		
		d.findElement(create_sharebus).click();
		Thread.sleep(2000);
		
		d.findElement(share_publish).click();
		Thread.sleep(2000);
	}
	
	
	
	By trip_name = By.xpath("(//input[@class='form-control rounded'])[1]");
	
	By category = By.xpath("//p[contains(text(),'Sport')]");
	
	By preview_andPublish = By.xpath("//span[contains(text(),'Preview and publish')]");
	
	By Publish = By.xpath("(//span[contains(text(),'Publish')])[2]");
	
	
	public void trip_publish() throws InterruptedException {
		String random = RandomStringUtils.randomAlphabetic(5);
		
		d.findElement(trip_name).sendKeys(random);
		Thread.sleep(2000);
		
		d.findElement(category).click();
		Thread.sleep(2000);
		
		d.findElement(preview_andPublish).click();
		Thread.sleep(2000);
		
		d.findElement(Publish).click();
		Thread.sleep(2000);
		
	}
	
	
	
	By my_buses = By.xpath("//button[@class='btn sb-btn-sharelead rounded-pill sb-btn-lg text-dark fw-bold']");
	By Trip_name = By.xpath("//span[@class='ms-2 text-start']");
	
	public void Verify_trip() throws InterruptedException {
		
		d.findElement(my_buses).click();
		Thread.sleep(2000);
		
		String verify_name = d.findElement(Trip_name).getText();
		System.out.println(verify_name);
	}
}
