package FlipkartBDD;



import org.openqa.selenium.By;

import FlipkartPOM.HomePage;
import FlipkartPOM.SearchResultsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static FlipkartBDD.Hooks.driver;
public class FlipkartBDD {
	
	HomePage homepage;
	SearchResultsPage resultspage;
	
	@Given("^i open the flipkart website$")
    public void i_open_the_flipkart_website() throws Throwable {
        
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("html/body/div[2]/div/div/button")).click();
		homepage  = new HomePage(driver);
    }

	@When("^serch for \"([^\"]*)\"$")
    public void serch_for_something(String strArg1) throws Throwable {
       homepage.Searchingfor(strArg1);
       Thread.sleep(5000);
    }

    @Then("^i select random brand$")
    public void i_select_random_brand() throws Throwable {
      resultspage = new SearchResultsPage(driver);
      resultspage.SelectBrand();
      Thread.sleep(5000);
    }
    
    @And("^i select sortby option$")
    public void i_select_sortby_option() throws Throwable {
       resultspage.clicksortby();
       Thread.sleep(5000);
    }
    
    
    @Then("^I click browserback$")
    public void i_click_browserback() throws Throwable {
      resultspage.navigateback();
      Thread.sleep(5000);
    }

    @And("^i selest pagenation$")
    public void i_selest_pagenation() throws Throwable {
      resultspage.selectpage();
    }

    @And("^i select item$")
    public void i_select_item() throws Throwable {
       resultspage.selectitem();
    }

    @And("^i click on add to cart button$")
    public void i_click_on_add_to_cart_button() throws Throwable {
       resultspage.Addtocart();
    }

}
