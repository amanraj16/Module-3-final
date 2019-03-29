package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;

import com.capgemini.base.TestBaseDriver;
import com.capgemini.pages.RegistrationForm;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationTestSteps extends TestBaseDriver{
	
	static RegistrationForm registrationForm;
	
	public RegistrationTestSteps(){
		super();
		setUp();
	}
	
	public static void setUp(){
		initialization();
		registrationForm = new RegistrationForm();
	}
	
	@Given("^The Registration Page is being opened$")
	public void employeePage() throws Throwable {
		
	}

	@When("^The Registration Page  is opened$")
	public void employeePageOpen() throws Throwable {
		
	}

	@Then("^then the title must be (.*)$")
	public void validateEmployeePage(String name) throws Throwable {
		String titleOfPage = registrationForm.getTitle();
		assertEquals(name, titleOfPage);
		Thread.sleep(1500);
		driver.quit();
	}
	
	@Given("^The Registration Page is being opened$")
	public void the_registrationPage_is_open() throws Throwable {
	}

	@When("^leave the userid field empty and click submit$")
	public void leave_the_userid_field_empty_and_click_submit() throws Throwable {
		registrationForm.setPersonUserID(""); Thread.sleep(1500);
		registrationForm.setSubmitButton();
		Thread.sleep(1500);
	}
	@When("^given wrong userid field and click submit$")
	public void given_wrong_userid_field_and_click_submit() throws Throwable {
		registrationForm.setPersonUserID("amanraj"); Thread.sleep(1500);
		registrationForm.setSubmitButton();
		Thread.sleep(1500);
	}
	
	@Then("^then the alert box displayed$")
	public void then_the_alert_box_displayed() throws Throwable {
		Alert alertBox = driver.switchTo().alert();
		String message = alertBox.getText();
		System.out.println("ALERT:- " +message);
		driver.quit();
	}
	@When("^leave the password field empty and click submit$")
	public void leave_the_password_field_empty_and_click_submit() throws Throwable {
		registrationForm.setPersonUserID("amanraj"); Thread.sleep(1500); 
		registrationForm.setPersonPassword(""); Thread.sleep(1500);
		registrationForm.setSubmitButton();
		Thread.sleep(1500);
	}
	
	@When("^enter number in name field and click submit$")
	public void enter_number_in_name_field_and_click_submit() throws Throwable {
		registrationForm.setPersonUserID("amanraj"); Thread.sleep(1000); 
		registrationForm.setPersonPassword("amancapgemini"); Thread.sleep(1500); 
		registrationForm.setPersonUserName("aman16"); Thread.sleep(1500);
		registrationForm.setSubmitButton();
		Thread.sleep(1500);
	}
	
	@When("^given wrong password field and click submit$")
	public void given_wrong_password_field_and_click_submit() throws Throwable {
		registrationForm.setPersonUserID("amanraj"); Thread.sleep(1500); 
		registrationForm.setPersonPassword("amanraj7599260545"); Thread.sleep(1500);
		registrationForm.setSubmitButton();
		Thread.sleep(1500);
	}

	@When("^leave empty in name field and click submit$")
	public void leave_empty_in_name_field_and_click_submit() throws Throwable {
		registrationForm.setPersonUserID("amanraj"); Thread.sleep(1500); 
		registrationForm.setPersonPassword("amancapgemini16"); Thread.sleep(1500); 
		registrationForm.setPersonUserName(""); Thread.sleep(1500);
		registrationForm.setSubmitButton();
		Thread.sleep(1500);
	}
	
	@When("^leave empty in address field and click submit$")
	public void leave_empty_in_address_field_and_click_submit() throws Throwable {
		registrationForm.setPersonUserID("amanraj"); Thread.sleep(1500); 
		registrationForm.setPersonPassword("amancapgemini16"); Thread.sleep(1500); 
		registrationForm.setPersonUserName("aman"); Thread.sleep(1500);
		registrationForm.setPersonAddress(""); Thread.sleep(1500);
		registrationForm.setSubmitButton();
		Thread.sleep(1500);
	}

	@When("^enter number in address field and click submit$")
	public void enter_number_in_address_field_and_click_submit() throws Throwable {
		registrationForm.setPersonUserID("amanraj"); Thread.sleep(1500); 
		registrationForm.setPersonPassword("amancapgemini16"); Thread.sleep(1500); 
		registrationForm.setPersonUserName("aman"); Thread.sleep(1500);
		registrationForm.setPersonAddress("am@n/$16"); Thread.sleep(1500);
		registrationForm.setSubmitButton();
		Thread.sleep(1500);
	}
	
	@When("^do not select the country field and click submit$")
	public void do_not_select_the_country_field_and_click_submit() throws Throwable {
		registrationForm.setPersonUserID("amanraj"); Thread.sleep(1000); 
		registrationForm.setPersonPassword("116"); Thread.sleep(1000); 
		registrationForm.setPersonUserName("aman"); Thread.sleep(1000);
		registrationForm.setPersonAddress("pune"); Thread.sleep(1000);
		registrationForm.setPersonCountry("(Please select a country)"); Thread.sleep(1000);
		registrationForm.setSubmitButton();
		Thread.sleep(2000);
	}

	@When("^enter wrong data in zip field and click submit$")
	public void enter_wrong_data_in_zip_field_and_click_submit() throws Throwable {
		registrationForm.setPersonUserID("amanraj"); Thread.sleep(1000); 
		registrationForm.setPersonPassword("amancapgemin16"); Thread.sleep(1000); 
		registrationForm.setPersonUserName("aman"); Thread.sleep(1000);
		registrationForm.setPersonAddress("pune"); Thread.sleep(1000);
		registrationForm.setPersonCountry("India"); Thread.sleep(1000);
		registrationForm.setPersonZip("am");  Thread.sleep(1000);
		registrationForm.setSubmitButton();
		Thread.sleep(2000);
	}

	

}
