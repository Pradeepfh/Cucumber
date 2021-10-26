package stepdefinitions;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	public class StepDefinition{

	    @Given("^user is on home page$")
	    public void user_is_on_home_page(){
	    	System.out.println("home page");
	      
	    }

	    @When("^user login into application with username and pasword$")
	    public void user_login_into_application_with_username_and_pasword(){
	    	System.out.println("username and pasword");
	    }

	    @Then("^hope page is populated$")
	    public void hope_page_is_populated(){
	    	System.out.println("Validate page");
	    }

	}


