package com.qa.Amazon;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.pages.AmazonPages;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonStepDefinition {
	
	WebDriver driver;
	AmazonPages AmazonOR;
	//String Browser = "Chrome";
	
	@Before
	public void setUp() {
		System.out.println("Starting Test...");
	}
	
	@After
	public void tearDown() {
		System.out.println("Stopping Test...");
	}
	
	
	@Given("^the browser is invoked$")
	public void the_browser_is_invoked(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		AmazonOR = new AmazonPages(driver);
	}

	@Then("^the url should be launched$")
	public void the_url_should_be_launched() {
		driver.get("https://www.amazon.in/");
	}

	@Given("the user is on amazon home page$")
	public void the_user_is_on_amazon_home_page() {
		
		boolean contains = driver.getTitle().contains("Amazon");
		Assert.assertTrue(contains);
		}

	@Then("^select the Books as category$")
	public void select_the_Books_as_category() {
		AmazonOR.getCategory().selectByVisibleText("Books");
	}

	@Then("^type Da Vinci code in search text field$")
	public void type_Da_Vinci_code_in_search_text_field() {
		AmazonOR.getSearchTxtField().sendKeys("Da vinci code");
	}

	@When("^Magnifier button is clicked$")
	public void magnifier_button_is_clicked() {
		AmazonOR.getMagnifierBtn().click();
	}

	@Then("^the items related to search term should be fetched$")
	public void the_items_related_to_search_term_should_be_fetched() {
		List<WebElement> getallItems = AmazonOR.getallItems();
		for(WebElement item:getallItems) {
			System.out.println(item.getText());
		}
	}

	@Then("^the driver window should be closed$")
	public void the_driver_window_should_be_closed() {
		driver.close();
	}

	@When("^the user does mouse over on AccountsandList element$")
	public void the_user_does_mouse_over_on_AccountsandList_element(){
		Actions act = new Actions(driver);		
		WebElement ele = AmazonOR.getAccountsandList();		
		act.moveToElement(ele).build().perform();		
	}

	@Then("^click start here link$")
	public void click_start_here_link() {
		AmazonOR.getStartHereLink().click();
	}

	@When("^the user is landed on registration page$")
	public void the_user_is_landed_on_registration_page(){
		boolean contains = driver.getCurrentUrl().contains("register");
		Assert.assertTrue(contains);
	}

	@Then("^type the \"([^\"]*)\" as customer id$")
	public void type_the_as_customer_id(String input) throws InterruptedException {
		AmazonOR.getFirstNameTxtField().sendKeys(input);
		Thread.sleep(2000);
	}

	@Then("^fetch all the links present on the footer page$")
	public void fetch_all_the_links_present_on_the_footer_page() {
		List<WebElement> allFooterLinks = AmazonOR.getAllFooterLinks();
		for(WebElement link:allFooterLinks) {
			System.out.println(link.getText());
		}
	}
	
	@Then("^type item name in search text field$")
	public void type_item_name_in_search_text_field(DataTable ItemName) throws InterruptedException {
		
		List<String> asList = ItemName.asList(String.class);
		
		for(String item:asList) {
			AmazonOR.getSearchTxtField().clear();
			AmazonOR.getSearchTxtField().sendKeys(item);
			Thread.sleep(2000);
			AmazonOR.getSearchTxtField().submit();
		}
		
	}

	@Then("^select the \"([^\"]*)\" as category$")
	public void select_the_as_category(String Category) throws InterruptedException {
		AmazonOR.getCategory().selectByVisibleText(Category);
		Thread.sleep(2000);
	}

	@Then("^type \"([^\"]*)\" in search text field$")
	public void type_in_search_text_field(String ItemName) throws InterruptedException {
		AmazonOR.getSearchTxtField().sendKeys(ItemName);
		Thread.sleep(2000);
	}


	
	
	
}
