package starter.story;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginFailPass {
    @Given("I am on the Sign in page With Link https")
    public void I_am_on_the_login_page_With_Link_https() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @When("I enter Password incorrectly")
    public void I_enter_Password_incorrectly() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }

    @When("I click {string} buttom Password incorrectly")
    public void  click_buttom_Password_incorrectly(String string) {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }
    @Then("Warning Password not Right and stay Sign in page")
    public void Warning_Password_Failed_and_Back_to_login_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
    }
}
