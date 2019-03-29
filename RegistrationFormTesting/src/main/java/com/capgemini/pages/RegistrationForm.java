package com.capgemini.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.capgemini.base.TestBaseDriver;

public class RegistrationForm extends TestBaseDriver{

	public RegistrationForm() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"usrID\"]")
	WebElement personUserId;
	
	@FindBy(xpath = "//*[@id=\"pwd\"]")
	WebElement personPassword;
	
	@FindBy(xpath = "//*[@id=\"usrname\"]")
	WebElement personUserName;
	
	@FindBy(xpath = "//*[@id=\"addr\"]")
	WebElement personAddress;
	
	@FindBy(xpath = "/html/body/form/ul/li[10]/select")
	WebElement personCountry;
	
	@FindBy(xpath = "/html/body/form/ul/li[12]/input")
	WebElement personZip;
	
	@FindBy(xpath = "/html/body/form/ul/li[14]/input")
	WebElement personEmail;
	
	@FindBy(xpath = "/html/body/form/ul/li[16]/input")
	WebElement personMale;
	
	@FindBy(xpath = "/html/body/form/ul/li[17]/input")
	WebElement personFemale;
	
	@FindBy(xpath = "/html/body/form/ul/li[19]/input")
	WebElement personEnglish;
	
	@FindBy(xpath = "/html/body/form/ul/li[20]/input")
	WebElement personNonEnglish;
	
	
	@FindBy(xpath = "//*[@id=\"desc\"]")
	WebElement personAbout;
	
	@FindBy(xpath = "/html/body/form/ul/li[23]/input")
	WebElement submit;

	//Getter and Setter
		public WebElement getPersonUserID() {
			return personUserId;
		}

		public void setPersonUserID(String personUserID) {
			this.personUserId.sendKeys(personUserID);
		}

		public WebElement getPersonPassword() {
			return personPassword;
		}

		public void setPersonPassword(String personPassword) {
			this.personPassword.sendKeys(personPassword);
		}

		public WebElement getPersonUserName() {
			return personUserName;
		}

		public void setPersonUserName(String personUserName) {
			this.personUserName.sendKeys(personUserName);
		}

		public WebElement getPersonAddress() {
			return personAddress;
		}

		public void setPersonAddress(String personAddress) {
			this.personAddress.sendKeys(personAddress);
		}

		public WebElement getPersonCountry() {
			return personCountry;
		}

		public void setPersonCountry(String personCountry) {
			Select countrySelect = new Select(this.personCountry);
			countrySelect.selectByVisibleText(personCountry);
		}

		public WebElement getPersonZip() {
			return this.personZip;
		}

		public void setPersonZip(String personZip) {
			this.personZip.sendKeys(personZip);
		}

		public WebElement getPersonEmail() {
			return this.personEmail;
		}

		public void setPersonEmail(String personEmail) {
			this.personEmail.sendKeys(personEmail);
		}

		public WebElement getPersonMale() {
			return this.personMale;
		}

		public void setPersonMale(String personMale) {
			this.personMale.sendKeys(personMale);
		}

		public WebElement getPersonFemale() {
			return this.personFemale;
		}

		public void setPersonFemale(String personFemale) {
			this.personFemale.sendKeys(personFemale);
		}

		public WebElement getPersonEnglish() {
			return this.personEnglish;
		}

		public void setPersonEnglish(String personEnglish) {
			this.personEnglish.sendKeys(personEnglish);
		}

		public WebElement getPersonNonEnglish() {
			return personNonEnglish;
		}

		public void setPersonNonEnglish(String personNonEnglish) {
			this.personNonEnglish.sendKeys(personNonEnglish);
		}

		public WebElement getPersonDescription() {
			return personAbout;
		}

		public void setPersonDescription(String personDescription) {
			this.personAbout.sendKeys(personDescription);
		}

		public void setSubmitButton() {
			this.submit.click();
		}

		public String getTitle() {
			return driver.getTitle();
		}
}
