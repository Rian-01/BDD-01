package starter.story;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginFailCase {
    @Given("I am on the Sign in page with link")
    public void I_am_on_the_Login_page_with_link() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @When("I enter my username and Password incorrectly")
    public void I_enter_my_username_and_Password_incorrectly() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @When("I click {string} buttom with failed case")
    public void  click_buttom_with_failed_case(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
   }

    @Then("Warning Username not valid and stay Sign in page")
    public void warning_username_and_Password_failed_and_back_to_page_login() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }
}
