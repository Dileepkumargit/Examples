package Git.Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirts");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-250)");
		Select sort = new Select(driver.findElement(By.id("s-result-sort-select")));
		List<WebElement> li = sort.getOptions();
		li.size();
		System.out.println(li.size());
		driver.close();
		

	}

}
