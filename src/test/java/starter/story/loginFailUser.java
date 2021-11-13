package starter.story;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginFailUser {
    @Given("I am on the Sign in Page with Web")
    public void I_am_on_the_Login_Page_with_Web() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @When("I enter username incorrectly and Password correctly")
    public void I_enter_username_incorrectly_and_Password_correctly() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }
    @When("I click {string} butt username incorrectly")
    public void  click_butt_in_page(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }
    @Then("Warning Username Failed and stay Sign in page")
    public void Warning_Username_Failed_and_Back_to_login_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }
}
