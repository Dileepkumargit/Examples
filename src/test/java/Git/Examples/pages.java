package Git.Examples;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pages {
	WebDriver driver;
	public pages(WebDriver driver){
		this.driver=driver;
	}
	public List<String> getallpages() {
		List<WebElement> PageNo = driver.findElements(By.xpath("//a[@class='_2Xp0TH']"));
		return PageNo.stream().map(a->a.getText()).distinct().collect(Collectors.toList());
	}
	public void selectpage(String pagenumber) {
		driver.findElement(By.xpath("//a[text()='"+pagenumber+"']")).click();
		
	}

}
