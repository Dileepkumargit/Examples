package FlipkartPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By searchfor = By.name("q");
	By clickon   = By.name("q");
	
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	public void Searchingfor(String strArg1) {
		driver.findElement(searchfor).sendKeys(strArg1);
		driver.findElement(clickon).sendKeys(Keys.ENTER);
		
	}
	
	

}
