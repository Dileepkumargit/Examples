package Git.Examples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.PageRanges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartTest {


	public static void main(String[] args) throws AWTException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("html/body/div[2]/div/div/button")).click();
	 	    driver.findElement(By.name("q")).sendKeys("mobiles");
	 	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	 	    
	 	   facets facet = new facets(driver);
	 	   List<String> allbrands =facet.getallbrands();
	 	   System.out.println(allbrands.toString());
	 	   String brands = allbrands.get(new Random().ints(0,allbrands.size()-1).findFirst().getAsInt());
	 	   System.out.println(brands);
	       facet.selectbrand(brands);
	 	   Thread.sleep(5000);

	       driver.findElement(By.xpath("//div[text()='Internal Storage']")).click();
	       storagefacet SF = new storagefacet(driver);
	       List<String> allSF = SF.getallstoragefacets();
	       System.out.println(allSF.toString());
	       String Selectfacet = allSF.get(new Random().ints(0,allSF.size()-1).findFirst().getAsInt());
	       System.out.println(Selectfacet);
	       SF.Selectstoragefacet(Selectfacet);
	       
	 	   pages page = new pages(driver);
	 	   List<String> allpages = page.getallpages();
	 	   System.out.println(allpages.toString());
	 	   String pagenumber = allpages.get(new Random().ints(0,allpages.size()-1).findFirst().getAsInt());
	 	   System.out.println(pagenumber);
	 	   page.selectpage(pagenumber);
	 	   
	 	  
	 	   	 Thread.sleep(10000);   
	        selectresult pick = new selectresult(driver);
	        List<String> results = pick.getallresults();
	        System.out.println(results.toString());
	        String selecteResult = results.get(new Random().ints(0,results.size()-1).findFirst().getAsInt());
	        System.out.println(selecteResult);
	        pick.select(selecteResult);	   
	        Thread.sleep(5000);
	        
	        //((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500)");
	        
	       	        
	        //Windows Handles
	        Set<String> Tabs = driver.getWindowHandles();
	        List<String> NewWindow = new ArrayList<>(Tabs);
	        driver.switchTo().window(NewWindow.get(0));
	        Thread.sleep(3000);
	        

	        /*selectresult pick1 = new selectresult(driver);
	        List<String> results1 = pick1.getallresults();
	        //System.out.println(results1.toString());
	        String selecteResult1 = results1.get(new Random().ints(0,results1.size()-1).findFirst().getAsInt());
	        System.out.println(selecteResult1);
	        pick1.select(selecteResult1);	
	        Thread.sleep(5000);
	       
	        driver.switchTo().window(NewWindow.get(1));
	        driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click(); */
	       
	}

}
