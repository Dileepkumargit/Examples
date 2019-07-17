package Git.Examples;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facets {
	 WebDriver driver;
	 facets(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	public List<String> getallbrands() {
		/* ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[contains(text(),'MORE')]")));
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//span[contains(text(),'MORE')]")));

		 driver.findElement(By.xpath("//span[contains(text(),'MORE')]")).click();*/
		List<WebElement> Brand =driver.
				findElements(By.xpath("//div[text()='Brand']/parent::div/following-sibling::div//div[@title]"));
		return Brand.stream().map(a->a.getText()).distinct().collect(Collectors.toList());
	}
	public void selectbrand(String Select) {
		//driver.findElement(By.xpath("//div[@title='M']")).click();
		driver.findElement(By.xpath("//div[text()='"+Select+"']")).click();
	}

}
