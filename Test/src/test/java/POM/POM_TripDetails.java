package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class POM_TripDetails {
	
	
	WebDriver d ;

	public POM_TripDetails(WebDriver driver) {

		d = driver;
		PageFactory.initElements(d, this);
		
	}
	
	By from = By.id("POM_TripDetails");
	
	By to = By.id("destination");
	
	By dateClick = By.xpath("(//input[@class='p-inputtext p-component pv-datepicker-input'])[1]");
	
	By monthYear = By.xpath("(//button[@class='p-datepicker-month p-link'])");
	
	By rightArrow = By.xpath("(//span[@class='p-datepicker-next-icon pi pi-chevron-right'])");
	
	public int  day = 28;
	By datepicker = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr/td[contains(text(),"+day+")]");
	
	public void Tripdetails() {
		
		d.findElement(from).sendKeys("Oslo, Norway");
		
		d.findElement(to).sendKeys("Kolbotn, Norway");
		
		
		
		
	
		// clickuploaddatebutton

		String month2 = "MARCH 2022";

		d.findElement(dateClick).click(); // click calender

		while (true) {
			String text = d.findElement(monthYear).getText(); // locator is month and year

			if (text.equals(month2)) {
				break;
			} else {

				d.findElement(rightArrow).click(); // locator of site arrow.you have to change it
			}
		}
		
		d.findElement(datepicker).click(); // locator of all date.
	}
}
