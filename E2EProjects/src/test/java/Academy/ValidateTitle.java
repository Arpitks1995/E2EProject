package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidateTitle extends base {
	
	@BeforeTest
	public void intialize() throws IOException {
		driver=intializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void basePageNavigation() throws IOException {
		driver.get(prop.getProperty("url"));
		LandingPage lp=new LandingPage(driver);
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES");
		
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
}
