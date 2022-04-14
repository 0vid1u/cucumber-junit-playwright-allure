package my.accelerator.atf.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class IsFridaySteps {
    @Given("Given today is Sunday")
    public void today_is_sunday() {
        System.out.println("today is Sunday");
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        System.out.println("When I ask whether it's Friday yet");
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        System.out.println("Then I should be told " + string);
    }
}
