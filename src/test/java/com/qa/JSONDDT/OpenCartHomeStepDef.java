package com.qa.JSONDDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;


import com.qa.pages.OpenCartPages;
import com.qa.utility.ExcelReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class OpenCartHomeStepDef {
	WebDriver driver;
	OpenCartPages OpenCartOR;
	FileInputStream fileLoc;
	Properties prop;
	JavascriptExecutor Js;
	@Before
	public void setUp() throws IOException {
		Reporter.log("Starting.......",true);	
		fileLoc = new FileInputStream("C:\\Users\\MUJAISWA\\eclipse-workspace\\OpenCart.TestAutomation\\src\\test\\resources\\testdata\\config.properties");
		prop = new Properties();
		prop.load(fileLoc);	
		
	}
	@After
	public void tearDown() {
       
		Reporter.log("Stoping.......",true);
	
	}
	@Given("open the browser")
	public void open_the_browser() {
		
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();	
		}
		else if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		}
		else if(browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();	
		}
		OpenCartOR = new OpenCartPages(driver);
		Js= (JavascriptExecutor)driver;
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);    
	}
	@Then("the url should be launched")
	public void the_url_should_be_launched() {	
		driver.get(prop.getProperty("url"));	    
	}
	@Given("the user is on opencart home page")
	public void the_user_is_on_opencart_home_page() throws InterruptedException {
		boolean contains = driver.getTitle().contains("Your Store");
		
		Thread.sleep(1500);
		if(contains) {
			Reporter.log("Yes the user is on opencart homepage",true);
			Assert.assertTrue(contains);
			
		}
		else{
			Reporter.log("No the user is not on opencart homepage",true);
			Assert.assertTrue(contains);
		}
		
	}
	@Given("type mobile in search text field")
	public void type_mobile_in_search_text_field() throws InterruptedException {
		
		OpenCartOR.getsearchTextField().sendKeys("Mobile");	
	
	}
	@When("magnifier button is clicked")
	public void magnifier_button_is_clicked() throws InterruptedException {
		OpenCartOR.getmaginifierbtn().click();   

	}
	@Then("navigates to search page")
	public void navigates_to_search_page() throws InterruptedException {
		
	  boolean contains =   driver.getTitle().contains("Search");
	  
	  if(contains) {
			Reporter.log("Yes the user is navigated to search page",true);
			Assert.assertTrue(contains);
			
		}
		else{
			Reporter.log("No the user is not navigated to search page",true);
			Assert.assertTrue(contains);
		}
		
	}
	@Then("check if mobile is written in search criteria text field")
	public void check_if_mobile_is_written_in_search_criteria_text_field() throws InterruptedException {
		String str = OpenCartOR.getSearchCriteriaTextField().getAttribute("value");
		boolean contains = str.contentEquals("Mobile");
		if(contains) {
			Reporter.log("Yes, search criteria contains search item",true);
			Assert.assertTrue(contains);
		}
		else{
			Reporter.log("No,search criteria doesnot contains search item",true);
			Assert.assertTrue(contains);
		}	
	}
	@Then("select the Phones & PDAs as category")
	public void select_the_phones_pd_as_as_category() throws InterruptedException {
		Thread.sleep(1500);
		OpenCartOR.getCategory().selectByVisibleText("Phones & PDAs");
	}
	@Then("click the checkbox to select of search in subcategories")
	public void click_the_checkbox_to_select_of_search_in_subcategories() throws InterruptedException {
		Thread.sleep(1500);
		OpenCartOR.getSearchInSubCategory().click();
	}
	@Then("click the checkbox of search in product description")
	public void click_the_checkbox_of_search_in_product_description() throws InterruptedException {
		Thread.sleep(1500);
		OpenCartOR.getSearchInProductDescription().click();
	}
	@When("search button is clicked")
	public void search_button_is_clicked() throws InterruptedException {
		OpenCartOR.getSearchbtn().click();
	}
	@Then("the items related to search term should be fetched")
	public void the_items_related_to_search_term_should_be_fetched() throws InterruptedException {
		Thread.sleep(1500);
		List<WebElement> getallItems = OpenCartOR.getallItems();
		for(WebElement item:getallItems) {
			System.out.println(item.getText());
		    Reporter.log(item.getText(),true);
		}
	}
	@Then("the driver window should be closed")
	public void the_driver_window_should_be_closed() {
	   driver.close();
	}
	

	@Then("type {string} as search criteria")
	public void type_as_search_criteria(String stringitem) {
		 OpenCartOR.getSearchCriteriaTextField().sendKeys(stringitem);
	}
	@Then("select the {string} as category")
	public void select_the_as_category(String stringcat) {
		 OpenCartOR.getCategory().selectByVisibleText(stringcat); 
	}
	@Then("check if search in subcategory checkbox is enabled for selection")
	public void check_if_search_in_subcategory_checkbox_is_enabled_for_selection() {
		
		 boolean enabled= OpenCartOR.getSearchInSubCategory().isEnabled();
		 
		 if(enabled)
		 {
			 Reporter.log("Yes, Search in subcategory checkbox is enabled",true);
			 Assert.assertTrue(enabled);
		 }
		 else
		 {
			 Reporter.log("No, Search in subcategory checkbox is not enabled",true);
			 Assert.assertTrue(enabled);
		 }
	    
	}

//PositiveTest
	@Given("check if MyAccount is displayed on Homepage")
	public void check_if_my_account_is_displayed_on_homepage() {
	    boolean displayed = OpenCartOR.getMyAccount().isDisplayed();
	    if(displayed)
	    {
	    	Reporter.log("Yes My Account is displayed on Homepage",true);
	    	Assert.assertTrue(displayed);
	    }else {
	    	Reporter.log("No My Account is not displayed on Homepage",true);
	    	Assert.assertTrue(displayed);}
	}
	@When("MyAccount Link is clicked")
	public void my_account_link_is_clicked() {
		OpenCartOR.getMyAccount().click();   
	}
	@Then("check if dropdown has register and login as option")
	public void check_if_dropdown_has_register_and_login_as_option() {
	   
		if(OpenCartOR.getalloptions().isEnabled()&&OpenCartOR.getalloptions().isDisplayed()) {
			Reporter.log("Yes, In My Account, login and Register both options are displayed",true);
	    	
		}else {
			Reporter.log("No, In My Account, login and Register both options are not displayed",true);
		}
	}
	
	@When("Register option is clicked")
	public void register_option_is_clicked() {
	    OpenCartOR.getRegister().click();
	}
	@Then("navigates to Register Account page")
	public void navigates_to_register_account_page() {
	    boolean contains = driver.getTitle().contains("Register Account");
	    if(contains) {
	    	Reporter.log("Yes user is navigated to Register Account Page", true);
	    	Assert.assertTrue(contains);
	    }else{
	    	Reporter.log("No user is not navigated to Register Account Page", true);
	    	Assert.assertTrue(contains);
	    }
	}
	@Then("type First Name")
	public void type_first_name() {
		OpenCartOR.getFirstNameTextField().sendKeys(prop.getProperty("fname"));
	}
	@Then("type Last Name")
	public void type_last_name() {
		OpenCartOR.getLastNameTextField().sendKeys(prop.getProperty("lname"));
	}
	@Then("type E-Mail")
	public void type_e_mail() {
		OpenCartOR.getEmailTextField().sendKeys(prop.getProperty("email"));
	}
	@Then("type Telephone")
	public void type_telephone() {
		OpenCartOR.getTPhoneTextField().sendKeys(prop.getProperty("tphone"));
	}
	@Then("type password")
	public void type_password() {
		OpenCartOR.getPassTextField().sendKeys(prop.getProperty("pwd"));
	}
	@Then("again type confirm password")
	public void again_type_confirm_password() {	
		OpenCartOR.getConfirmPassTextField().sendKeys(prop.getProperty("cpwd"));
	}
	@Then("check if No is defaulty selected")
	public void check_if_no_is_defaulty_selected() {
	    boolean selected = OpenCartOR.getNoCheckboxField().isSelected();
	    if(selected) {
	    	Reporter.log("Yes, it is defaultly selected",true);
	    	Assert.assertTrue(selected);
	    }
	    else {
	    	Reporter.log("No, it is not defaultly selected",true);
	    	Assert.assertTrue(selected);
	    }
	}
	@Then("click the checkbox of I have read and agreed to the privacy policy")
	public void click_the_checkbox_of_i_have_read_and_agreed_to_the_privacy_policy() {
	   OpenCartOR.getreadAgreedcheckbox().click();
	}
	@When("continue button is clicked")
	public void continue_button_is_clicked() {
		OpenCartOR.Continuebtn().click();
	    
	}
	@Then("navigates to My Account page")
	public void navigates_to_my_account_page() {
	    boolean contains = driver.getTitle().contains("Your Account Has Been Created!");
	    if(contains) {
	    	Reporter.log("Yes, your account is created and you are on My Account page");
	    	Assert.assertTrue(contains);
	    }else 
	    	{
		    	Reporter.log("No, your account is not created and you are on not My Account page");
		    	Assert.assertTrue(contains);
		    }
	    }
	
	@Then("Mesaage displayed as Your account has been created")
	public void mesaage_displayed_as_your_account_has_been_created() {
		String text = OpenCartOR.getMessage().getText();
		System.out.println(text);
	}
	
	//SmokeTest
	@When("login option is clicked")
	public void login_option_is_clicked() {
		OpenCartOR.getLogin().click();
	}
	@Then("navigates to login page")
	public void navigates_to_login_page() {
	   boolean contains = driver.getCurrentUrl().contains("https://demo.opencart.com/index.php?route=account/login");
	   if(contains) {
		   Reporter.log("Yes user is navigated to Login Account page",true);
		   Assert.assertTrue(contains);
	   }else{
		   Reporter.log("No user is not navigated to Login Account page",true);
		   Assert.assertTrue(contains);
	   }
	}
	
	@Then("type {string} as email address and type {int} as password")
	public void type_as_email_address_and_type_as_password(String sheetName, Integer rowNum) throws InvalidFormatException, IOException, InterruptedException {
	    ExcelReader reader = new ExcelReader();
	    List<Map<String, String>> TestData = reader.getData("C:\\Users\\MUJAISWA\\eclipse-workspace\\OpenCart.TestAutomation\\src\\test\\resources\\testdata\\TestData.xlsx", sheetName);
	    String Email = TestData.get(rowNum).get("e-id");
		String Password = TestData.get(rowNum).get("pwd");
		
		OpenCartOR.getEmailTextField().sendKeys(Email);
		OpenCartOR.getPassTextField().sendKeys(Password);
	Thread.sleep(2000);
	}
	
	@When("login button is clicked")
	public void login_button_is_clicked() {
	  OpenCartOR.getloginbtn().click();
	}
	
	@Then("navigates to myAccounts page")
	public void navigates_to_my_accounts_page() {
	    boolean contains = driver.getTitle().contains("My Account");
	    if(contains) {
	    	Reporter.log("Hey You are successfully loggedin, Thank You!");
	    	Assert.assertTrue(contains);
	    }else {
	    	Reporter.log("Oops! We found an error");
	    	Assert.assertTrue(contains);
	    }
	}
	@Then("Check if dropdown has Logout option")
	public void check_if_dropdown_has_logout_option() {
		if(OpenCartOR.getalloptions().isEnabled()&&OpenCartOR.getalloptions().isDisplayed()) {
			Reporter.log("Yes dropdown is displayed",true);
		}else {
			Reporter.log("No dropdown is not displayed",true);
		}
	}
	@When("Logout option is clicked")
	public void logout_option_is_clicked() {
	    OpenCartOR.getLogoutbtn().click();
	}
	@Then("navigates to Account Logout page")
	public void navigates_to_account_logout_page() {
	    boolean contains = driver.getTitle().contains("Logout");
	    if(contains) {
	    	Reporter.log("Hey You are successfully loggedout, Thank You!");
	    	Assert.assertTrue(contains);
	    }else {
	    	Reporter.log("Oops! We found an error");
	    	Assert.assertTrue(contains);
	    }
	}
	@Then("Message displayed as Account Logout")
	public void message_displayed_as_account_logout() {
		String text = OpenCartOR.getMessage().getText();
		System.out.println(text);
	}

	
	//REVIEW
	
	@Then("scrolldown to the image")
	public void scrolldown_to_the_image() throws InterruptedException {
		WebElement ele = OpenCartOR.getimageclick();
		Js.executeScript("arguments[0].scrollIntoView()",ele);
		Thread.sleep(2000);
	}
	@When("image is clicked")
	public void image_is_clicked() {
		OpenCartOR.getimageclick().click();
	}
	@Then("scrolldown to the review")
	public void scrolldown_to_the_review() {
		Js.executeScript("window.scrollBy(0,500)");
	}
	@When("click on review")
	public void click_on_review() {
	    OpenCartOR.getreviewlink().click();
	}
	@Then("type {string} as your name")
	public void type_as_your_name(String name) throws InterruptedException {
	    OpenCartOR.getYourNameTextField().sendKeys(name);
	    Thread.sleep(1000);
	}
	@Then("type {string} as your review")
	public void type_as_your_review(String review) {
		OpenCartOR.getYourReviewTextField().sendKeys(review);
	   
	}
	@Then("give {int} as star rating")
	public void give_as_star_rating(Integer rating) {
		if(rating == 1) {
	   OpenCartOR.getRadiolink1().click();}
		else if(rating == 2) {
			OpenCartOR.getRadiolink2().click();
		}
		else if(rating ==3) {
			OpenCartOR.getRadiolink3().click();	
		}
		else if(rating == 4) {
			OpenCartOR.getRadiolink4().click();
		}
		else if(rating == 5){
		   //  String attribute = OpenCartOR.getRadiolink().;
			OpenCartOR.getRadiolink().click();
		}
		else {
			
		}
		
		
	}
	
	@When("continue btn is clicked for Negative Review")
	public void continue_btn_is_clicked_for_Negative_Review() throws InterruptedException {
	    Thread.sleep(1000);
	    OpenCartOR.getContbtn().click();
	    Thread.sleep(1500);
	    Reporter.log(OpenCartOR.getReviewWarningMssg().getText(),true);
	    
	}
	@When("continue btn is clicked")
	public void continue_btn_is_clicked() throws InterruptedException {
	    Thread.sleep(1000);
	    OpenCartOR.getContbtn().click();
	    Thread.sleep(1500);
	    Reporter.log(OpenCartOR.getReviewMssg().getText(),true);
	   
	    
	}

	
	//JSONTEST
	@Then("type <email> as email address and type <pwd> as password")
	public void type_email_as_email_address_and_type_pwd_as_password() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("C:\\Users\\MUJAISWA\\eclipse-workspace\\OpenCart.TestAutomation\\src\\test\\resources\\testdata\\testdata.json");
		//Read JSON file
		Object obj = jsonParser.parse(reader);//parsing the json data
		JSONObject loginobj = (JSONObject)obj;
		String email = (String)loginobj.get("email");
		String passwd = (String)loginobj.get("pwd");

		System.out.println(email+"\t"+passwd);
		OpenCartOR.getEmailTextField().sendKeys(email);
		OpenCartOR.getPassTextField().sendKeys(passwd);
	}

	

	}
		

