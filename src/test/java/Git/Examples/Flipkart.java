package Git.Examples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws AWTException {
		 System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("html/body/div[2]/div/div/button")).click();
	 	    driver.findElement(By.name("q")).sendKeys("iphones");
	 	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	     
	        selectresult pick = new selectresult(driver);
	        List<String> results = pick.getallresults();
	        System.out.println(results.toString());
	        String selecteResult = results.get(new Random().ints(0,results.size()-1).findAny().getAsInt());
	        System.out.println(selecteResult);
	        pick.selestedresult(selecteResult);
	        
	        //Windows Handles
	        Set<String> Tabs = driver.getWindowHandles();
	        List<String> NewWindow = new ArrayList<>(Tabs);
	        driver.switchTo().window(NewWindow.get(0));
	        selectresult pick1 = new selectresult(driver);
	        List<String> results1 = pick1.getallresults();
	        String selecteResult1 = results1.get(new Random().ints(0,results1.size()-1).findAny().getAsInt());
	        System.out.println(selecteResult1);
	        pick1.selestedresult(selecteResult1);
	        

	}

}
