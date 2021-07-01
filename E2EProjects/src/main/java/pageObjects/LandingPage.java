package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	By signin=By.xpath("//a[contains(@href,\"sign_in\")]");
	By title=By.xpath("//*[text()='Featured Courses']");
	By NavBar=By.xpath("//*[@class=\"nav navbar-nav navbar-right\"]");

	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getLogin() {
		return driver.findElement(signin);
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	
	public WebElement getNaviagationBar() {
		return driver.findElement(NavBar);
	}
	
	
}
