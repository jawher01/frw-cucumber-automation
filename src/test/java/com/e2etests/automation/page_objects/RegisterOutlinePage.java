package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegisterOutlinePage {

	private ConfigFileReader configFileReader;
	
	/** @FindBy **/
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	public static WebElement register;
	
	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstName;

	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;

	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phone;

	@FindBy(how = How.ID, using = "userName")
	public static WebElement email;

	@FindBy(how = How.NAME, using = "address1")
	public static WebElement address;

	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;

	@FindBy(how = How.NAME, using = "state")
	public static WebElement state;

	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;

	@FindBy(how = How.NAME, using = "country")
	public static WebElement countryDropdown;

	@FindBy(how = How.ID, using = "email")
	public static WebElement userName;

	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;

	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPassword;
	
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement BtnEnvoyer;
	
	//Contractor
	public RegisterOutlinePage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/** Create methods **/
	public void ClickRegister() {
		register.click();
	}
	
	public void fillFirstName(String name) {
		firstName.sendKeys(name);
	}

	// lastName
	public void fillLastName(String last_Name) {
		lastName.sendKeys(last_Name);
	}

	// phone
	public void fillPhoneNumber(String phone_number) {
		phone.sendKeys(phone_number);
	}

	// email
	public void fillEmail(String text) {
		email.sendKeys(text);
	}

	// address
	public void fillAdress(String add) {
		address.sendKeys(add);
	}

	// city
	public void fillCity(String txt) {
		city.sendKeys(txt);
	}

	// state
	public void fillState(String txt) {
		state.sendKeys(txt);
	}

	// postalCode
	public void fillPostalCode(String txt) {
		postalCode.sendKeys(txt);
	}

	// countryDropdown
	public void selectCountry(String country) {
		Select countrySelect = new Select(countryDropdown);
		countrySelect.selectByVisibleText(country);
	}

	// userName
	public void fillUserName(String txt) {
		userName.sendKeys(txt);
	}

	// password
	public void fillPassword(String txt) {
		password.sendKeys(txt);
	}

	// confirmPassword
	public void fillConfirmPassword(String txt) {
		confirmPassword.sendKeys(txt);
	}
	
	public void clickButtonSub () {
		BtnEnvoyer.click();
	}

	
	
	
	
	
}
