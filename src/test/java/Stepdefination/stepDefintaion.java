package Stepdefination;

import cucumber.api.java.en.Given;

import  cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
public class stepDefintaion {
	
	

    @Given("^User is at landing page$")
    public void user_is_at_landing_page() throws Throwable {
    	System.out.println("Given is Executed via Cucumber");
        
    }

    @When("^user login in to application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_in_to_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("when is executed with username: "+ strArg1 +"  passowrd: "+ strArg2);
    }

    @Then("^Home Page of Website is populated$")
    public void home_page_of_website_is_populated() throws Throwable {
    	System.out.println("then is executed now");
        
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
        System.out.println("And method is executed");
    }

}