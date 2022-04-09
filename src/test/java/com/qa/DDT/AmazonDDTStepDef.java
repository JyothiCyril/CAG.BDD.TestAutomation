package com.qa.DDT;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.AmazonPages;
import com.qa.utility.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AmazonDDTStepDef {
	WebDriver driver;
	AmazonPages AmazonOR;

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

	@Given("^the user is on amazon home page$")
	public void the_user_is_on_amazon_home_page() {
		boolean contains = driver.getTitle().contains("Amazon");
		Assert.assertTrue(contains);
	}

	@Then("^select category and item name from the sheetname \"([^\"]*)\" and rowNum (\\d+)$")
	public void select_category_and_item_name_from_the_sheetname_and_rowNum(String sheetName, int rowNum) throws InvalidFormatException, IOException {

		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData("D:\\Capgemini\\CAG.BDD.TestAutomation\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx", sheetName);
		String Category = testData.get(rowNum).get("Category");
		String ItemName = testData.get(rowNum).get("ItemName");

		AmazonOR.getCategory().selectByVisibleText(Category);
		AmazonOR.getSearchTxtField().sendKeys(ItemName);

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
	public void the_driver_window_should_be_closed(){
		driver.close();
	}



}
