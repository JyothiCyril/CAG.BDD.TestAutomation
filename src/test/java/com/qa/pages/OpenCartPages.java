package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;



public class OpenCartPages {
	WebDriver driver;
	
	@FindBy(xpath="//header/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement searchTextField;
	
	public WebElement getsearchTextField() {
		return searchTextField;
	}
	
	@FindBy(xpath="//header/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]")
	WebElement magnifierbtn;
	
	public WebElement getmaginifierbtn() {
		return magnifierbtn;
	}
	
	@FindBy(id="input-search")
	WebElement searchcriteriatextfield;
	
	public WebElement getSearchCriteriaTextField() {
		return searchcriteriatextfield;
	}
	
	@FindBy(xpath="//body/div[@id='product-search']/div[1]/div[1]/div[1]/div[2]/select[1]")
	WebElement selectCategory;
	
	public Select getCategory() {
		Select Category = new Select(selectCategory);		
		return Category;
	}
	
	@FindBy(xpath="//body/div[@id='product-search']/div[1]/div[1]/div[1]/div[3]/label[1]/input[1]")
	WebElement SearchInSubCategory;
	
	public WebElement getSearchInSubCategory() {
		return SearchInSubCategory;
	}
	
	@FindBy(id="description")
	WebElement SearchInProductDescription;
	
	public WebElement getSearchInProductDescription() {
		return SearchInProductDescription;
	}
	
	@FindBy(id="button-search")
	WebElement Searchbtn;
	
	public WebElement getSearchbtn() {
		return Searchbtn;
	}
	
	
	@FindAll(@FindBy(xpath="//div[@class='caption']"))
	List<WebElement> allItems;
	
	public List<WebElement> getallItems(){
		return allItems;
	}
	
	@FindBy(xpath="//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]/i[1]")
	WebElement MyAccount;
	
	public WebElement getMyAccount() {
		return MyAccount;
	}
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']")
    WebElement alloptions;

	public WebElement getalloptions(){
	return alloptions;
	}
	@FindBy(linkText="Register")
	WebElement Register;
	
	public WebElement getRegister()
	{
		return Register ;
	}
	@FindBy(linkText="Login")
	WebElement Login ;
	
	public WebElement getLogin()
	{
		return Login;
	}
	@FindBy(id="input-firstname")
	WebElement FirstNameTextField;
	
	public WebElement getFirstNameTextField()
	{
		return FirstNameTextField;
	}
	@FindBy(id="input-lastname")
	WebElement LastNameTextField ;
	
	public WebElement getLastNameTextField()
	{
		return LastNameTextField ;
	}
	@FindBy(id="input-email")
	WebElement  EmailTextField;
	
	public WebElement getEmailTextField()
	{
		return EmailTextField ;
	}
	@FindBy(id="input-telephone")
	WebElement  TPhoneTextField;
	
	public WebElement getTPhoneTextField()
	{
		return TPhoneTextField ;
	}
	
	@FindBy(id="input-password")
	WebElement  PassTextField;
	
	public WebElement getPassTextField()
	{
		return PassTextField ;
	}
	
	@FindBy(id="input-confirm")
	WebElement  ConfirmPassTextField;
	
	public WebElement getConfirmPassTextField()
	{
		return ConfirmPassTextField ;
	}
	@FindBy(xpath="//div[@class='col-sm-10']/label[2]/input[1]")
	WebElement  NoField;
	
	public WebElement getNoCheckboxField()
	{
		return NoField ;
	}
	
	@FindBy(xpath="//div[@class='pull-right']/input[1]")
	WebElement readAgreedcheckbox;
	
	public WebElement getreadAgreedcheckbox()
	{
		return readAgreedcheckbox;
	}
	
	@FindBy(xpath="//div[@class='pull-right']/input[2]")
	WebElement  Continuebtn;
	
	public WebElement Continuebtn()
	{
		return Continuebtn;
	}
	
	@FindBy(xpath="//div[@id='content']/h1")
	WebElement  Message;
	
	public WebElement getMessage()
	{
		return Message;
	}
	
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement  loginbtn;
	
	public WebElement getloginbtn()
	{
		return loginbtn;
	}
	@FindBy(linkText="Logout")
	WebElement Logoutbtn;
	
	public WebElement getLogoutbtn() {
		return Logoutbtn;
	}
	
	@FindBy(xpath="	//a/img[@title='MacBook']")
	WebElement imageclick;

	public WebElement getimageclick() {
		return imageclick;
	}
	
	@FindBy(xpath="//a[contains(text(),'0 reviews')]")
	WebElement reviewlink;
	
	public WebElement getreviewlink() {
		return reviewlink;
	}
	
	@FindBy(id="input-name")
	WebElement YourNameTextField;
	
	public WebElement getYourNameTextField() {
		return YourNameTextField;
	}
	
	
	@FindBy(id="input-review")
	WebElement YourReviewTextField;
	
	public WebElement getYourReviewTextField() {
		return YourReviewTextField;
	}
	@FindBy(xpath="//form[@id=\"form-review\"]/div[4]/div/input[1]")
	WebElement Radiolink1;
	
	public WebElement getRadiolink1() {
		return Radiolink1;
	}
	@FindBy(xpath="//form[@id=\"form-review\"]/div[4]/div/input[2]")
	WebElement Radiolink2;
	
	public WebElement getRadiolink2() {
		return Radiolink2;
	}
	@FindBy(xpath="//form[@id=\"form-review\"]/div[4]/div/input[3]")
	WebElement Radiolink3;
	
	public WebElement getRadiolink3() {
		return Radiolink3;
	}
	@FindBy(xpath="//form[@id=\"form-review\"]/div[4]/div/input[4]")
	WebElement Radiolink4;
	
	public WebElement getRadiolink4() {
		return Radiolink4;
	}
	@FindBy(xpath="//form[@id=\"form-review\"]/div[4]/div/input[5]")
	WebElement Radiolink;
	
	public WebElement getRadiolink() {
		return Radiolink;
	}
	@FindBy(id="button-review")
	WebElement Contbtn;
	public WebElement getContbtn() {
		return Contbtn;
	}
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement ReviewMssg;
	public WebElement getReviewMssg() {
		return ReviewMssg;
	}
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement ReviewWarningMssg;
	public WebElement getReviewWarningMssg() {
		return ReviewWarningMssg;
	}
	
	
	//MouseOver
	
	public OpenCartPages(WebDriver rDriver) {		
		this.driver = rDriver;
		PageFactory.initElements(rDriver, this);
		
	}

}
