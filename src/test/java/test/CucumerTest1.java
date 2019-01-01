package test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

public class CucumerTest1 {

	@Given("^Open chrome and launch the url$")
	public void open_chrome_and_launch_the_url() throws Throwable {
	   
		System.out.println("Open chrome and launch the url");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password() throws Throwable {
		System.out.println("^I enter valid username and valid password$");

		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		System.out.println("^user should be able to login successfully$");

		// Write code here that turns the phrase above into concrete actions
	}

}
