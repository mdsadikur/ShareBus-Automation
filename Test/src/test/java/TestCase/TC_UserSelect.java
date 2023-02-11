package TestCase;

import org.testng.annotations.Test;

import Base.DriverSetup;
import POM.POM_UserSelect;

public class TC_UserSelect extends DriverSetup{
	
	@Test
	public void UserSelect() throws InterruptedException {
		
		POM_UserSelect cbox = new POM_UserSelect(driver);
		
		cbox.User();
		Thread.sleep(2000);
		
		cbox.Tripdetails();
		Thread.sleep(2000);
		
		cbox.Organization();
		Thread.sleep(2000);
		
		cbox.Passenger_goal();
		Thread.sleep(2000);
		
		cbox.trip_publish();
		Thread.sleep(2000);
		
		cbox.Verify_trip();
		Thread.sleep(2000);
	}

}
