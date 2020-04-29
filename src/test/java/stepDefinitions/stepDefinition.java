package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

	@Given("^User is on netbanking login page$")
	public void user_is_on_netbanking_login_page() throws Throwable {
		// code to navigate to login page
		System.out.println("navigated to login url");
		System.out.println("swswsw");
		System.out.println("swswcsw");

	}

    @When("^User enters login username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_enters_login_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
        System.out.println("swssdswsw");
        System.out.println("kl");

	}

	@Then("^Login sucessful$")
	public void login_sucessful() throws Throwable {
		// home page landed
		System.out.println("Landed to homepage");
		System.out.println("swcdcdcswsw");

	}

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
        System.out.println("sdwdwwswsw");
        System.out.println("dev branch");

	}

}