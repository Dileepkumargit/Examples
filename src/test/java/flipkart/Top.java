package flipkart;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Top {
	WebDriver driver;
	
	Top(WebDriver driver)
	{
		this.driver=driver;
	}

	public List<String> getallelements() {
		List<WebElement> Toprow = driver.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
		return Toprow.stream().map(a-> a.getText()).distinct().collect(Collectors.toList());
	}

	public void select(String random) {
		Actions action = new Actions(driver);
		
	WebElement a = 	driver.findElement(By.xpath("//span[text()='"+random+"']"));
	action.moveToElement(a).perform();
		
	}

}
