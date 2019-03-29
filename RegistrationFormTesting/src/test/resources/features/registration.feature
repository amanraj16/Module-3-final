Feature: Validate the title of the Registration Page.
  
  
  Scenario: Validate the title  Welcome to JobsWorld
    Given The Registration Page is being opened
    When The Registration Page  is opened
    Then then the title must be Welcome to JobsWorld
    
   Scenario: Validate the userid validation on no data entered
    Given The Registration Page is being opened
    When leave the userid field empty and click submit
    Then then the alert box displayed
    
    Scenario: Validate the userid validation on wrong given data
    Given The Registration Page is being opened
    When given wrong userid field and click submit
    Then then the alert box displayed
    
   Scenario: Validate the password on leave empty validation
    GivenThe Registration Page is being opened
    When leave the password field empty and click submit
    Then then the alert box displayed
    
   Scenario: Validate the password validation on wrong given
    Given The Registration Page is being opened
    When given wrong password field and click submit
    Then then the alert box displayed
    
    
    Scenario: Validate the name validation
	    Given The Registration Page is being opened
	    When enter number in name field and click submit
	    Then then the alert box displayed
	    
	 Scenario: Validate the name validation on leave empty
	    GivenThe Registration Page is being opened
	    When leave empty in name field and click submit
	    Then then the alert box displayed
	    
	 Scenario: Validate the address validation on leave empty
	    Given The Registration Page is being opened
	    When leave empty in address field and click submit
	    Then then the alert box displayed
	    
	  Scenario: Validate the address validation on wrong data given
	    GivenThe Registration Page is being opened
	    When enter number in address field and click submit
	    Then then the alert box displayed
	    
	  Scenario: Validate the country validation on selecting no country
	    Given The Registration Page is being opened
	    When do not select the country field and click submit
	    Then then the alert box displayed
	    
	  Scenario: Validate the zip code validation on wrong data given
	    Given The Registration Page is being opened
	    When enter wrong data in zip field and click submit
	    Then then the alert box displayed
	    
	  Scenario: Validate the email validation on wrong data given
	    Given The Registration Page is being opened
	    When enter wrong data in email field and click submit
	    Then then the alert box displayed
	    
	  Scenario: Validate the gender validation on no gender select
	    Given The Registration Page is being opened
	    When do not select gender field and click submit
	    Then then the alert box displayed
	    
	   Scenario: select language default English
	    Given The Registration Page is being opened
	    When select default language and click submit
	    Then then the alert box displayed
	    
	  
    
    
    