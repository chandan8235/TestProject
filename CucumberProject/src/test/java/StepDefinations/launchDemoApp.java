package StepDefinations;

import LoginPage.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class launchDemoApp {

	LogInPage lp = new LogInPage();

	@Given("Open Browser and Lunch Facebook Application")
	public void open_browser_and_lunch_facebook_application() {
		lp.OpenURL();

	}

	@When("User Enter the valid user name")
	public void user_enter_the_valid_user_name() {
		lp.EnterUserName();

	}

	@And("User  Enter the valid password")
	public void user_enter_the_valid_password() {
		// System.out.println("User Enter the valid password");
		lp.EnterValidPassword();

	}

	@And("User click on log in button")
	public void user_click_on_log_in_button() {
		// System.out.println("User click on log in button");
		lp.ClickOnLogin();

	}

	@Then("User  successfully able to login")
	public void user_successfully_able_to_login() {
		// System.out.println("User successfully able to login");
		lp.verifyLogin();

	}

	@When("User enter the Invalid Username")
	public void user_enter_the_invalid_username() {
		lp.EnterInvalidUserName();
		// System.out.println("User enter the Invalid Username");

	}

	@And("User enter the invalid Password")
	public void user_enter_the_invalid_password() {
		lp.EnterinValidPassword();
		// System.out.println("User enter the invalid Password");

	}

	@And("User click on login button")
	public void user_click_on_login_button() {
		lp.ClickOnLogin();
		// System.out.println("User click on login button");

	}

	@Then("User uneble to log in successfully")
	public void user_uneble_to_log_in_successfully() {
		lp.verifyLogin();
		// System.out.println("User uneble to log in successfully");

	}
}
