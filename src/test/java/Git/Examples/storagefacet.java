package Git.Examples;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class storagefacet {
	WebDriver driver;
	public storagefacet(WebDriver driver) {
		this.driver=driver;
	}
	public List<String> getallstoragefacets() {
		List<WebElement> Facets = driver.findElements(By.xpath("//div[text()='Internal Storage']/parent::div/following-sibling::div//div[@title]"));
		return Facets.stream().map(a->a.getText()).distinct().collect(Collectors.toList());
	}
	public void Selectstoragefacet(String selectfacet) {
		driver.findElement(By.xpath("//div[text()='"+selectfacet+"']")).click();
		
	}

}
