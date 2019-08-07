package flipkart;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart_Toprow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("html/body/div[2]/div/div/button")).click();
        
        Top facets = new Top(driver);
        List<String> allElements = facets.getallelements();
        System.out.println(allElements.toString());
        String random = allElements.get(new Random().ints(0,allElements.size()-1).findFirst().getAsInt());
        System.out.println(random);
        //WebElement a = driver.findElement(select)
        facets.select(random);
        Thread.sleep(5000);
      
        Mouse mouseover = new Mouse(driver);
        List<String> Mo = mouseover.getallMo();
        System.out.println(Mo.toString());
        String pick = Mo.get(new Random().ints(0,Mo.size()-1).findAny().getAsInt());
        System.out.println(pick);
        mouseover.select(pick);
        
	}

}
