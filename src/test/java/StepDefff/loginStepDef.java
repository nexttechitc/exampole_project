package StepDefff;

import Utility.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class loginStepDef extends TestBase{
	
	
	@Given("^Luanchh \"([^\"]*)\"$")
	public void luanchh(String URL) throws Throwable {
		launchApplication(URL);
	}

	@Then("^Click login$")
	public void click_login() throws Throwable {
	    
	}

	@Then("^Enter username and password and click login$")
	public void enter_username_and_password_and_click_login() throws Throwable {
	   
	}

	@Then("^Click samsung(\\d+) hyperlink$")
	public void click_samsung_hyperlink(int arg1) throws Throwable {
	    
	}

	@Then("^click addcart$")
	public void click_addcart() throws Throwable {
	    
	}

	@Then("^click Cart$")
	public void click_Cart() throws Throwable {
	    
	}

	@Then("^Verify user add item in cart$")
	public void verify_user_add_item_in_cart() throws Throwable {
	   
	}



}
