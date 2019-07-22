package FlipkartPOM;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Git.Examples.facets;
import Git.Examples.pages;
import Git.Examples.selectresult;

public class SearchResultsPage {
	WebDriver driver;
	
	By sortby = By.xpath("//div[@class='_1xHtJz'][2]");
	By pageno = By.xpath("//a[text()='5']");
	By addtocart = By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']");
	public SearchResultsPage(WebDriver driver) {
		this.driver=driver;
	}
	public void SelectBrand() {
		
		  facets facet = new facets(driver);
	 	   List<String> allbrands =facet.getallbrands();
	 	   System.out.println(allbrands.toString());
	 	   String brands = allbrands.get(new Random().ints(0,allbrands.size()-1).findFirst().getAsInt());
	 	   System.out.println(brands);
	       facet.selectbrand(brands);
	 	 
	}
	public void clicksortby() {
		driver.findElement(sortby).click();
	}
	public void selectpage() {
		pages page = new pages(driver);
	 	   List<String> allpages = page.getallpages();
	 	   System.out.println(allpages.toString());
	 	   String pagenumber = allpages.get(new Random().ints(0,allpages.size()-1).findFirst().getAsInt());
	 	   System.out.println(pagenumber);
	 	   page.selectpage(pagenumber);
	}
	public void navigateback() throws InterruptedException {
        Thread.sleep(5000);
        driver.navigate().back();		
	}
	public void selectitem() throws InterruptedException {
		Thread.sleep(5000);
		selectresult pick = new selectresult(driver);
        List<String> results = pick.getallresults();
        System.out.println(results.toString());
        String selecteResult = results.get(new Random().ints(0,results.size()-1).findFirst().getAsInt());
        System.out.println(selecteResult);
        pick.select(selecteResult);	
		
	}
	public void Addtocart() throws InterruptedException {
		Set<String> Tabs = driver.getWindowHandles();
        List<String> NewWindow = new ArrayList<>(Tabs);
        driver.switchTo().window(NewWindow.get(1));
        Thread.sleep(5000);
		driver.findElement(addtocart).click();
	}
	
	
	

}
