package Git.Examples;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selectresult {
	WebDriver driver;
	
	selectresult(WebDriver driver)
	{
		this.driver = driver;
	}

	public List<String> getallresults() {
		List<WebElement> allresults = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		return allresults.stream().map(a -> a.getText()).distinct().collect(Collectors.toList());
	}

	public void selestedresult(String selecteResult) {
		
		driver.findElement(By.xpath("//a[@class='_31qSD5']")).click();
	}

}
