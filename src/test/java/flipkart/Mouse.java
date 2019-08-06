package flipkart;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mouse {
	WebDriver driver;
	Mouse(WebDriver driver){
		this.driver= driver;
	}
	public List<String> getallMo() {
		List<WebElement> facet = driver.findElements(By.xpath("//li[@class='_1GPxMV _3mmoXN']//parent::ul//following-sibling::li//a[@title]"));
		return facet.stream().map(a->a.getText()).distinct().collect(Collectors.toList());
	}
	public void select(String pick) {
		driver.findElement(By.xpath("//a[text()='"+pick+"']")).click();
		
	}
	

}
