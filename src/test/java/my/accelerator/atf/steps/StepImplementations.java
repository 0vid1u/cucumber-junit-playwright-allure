package my.accelerator.atf.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;
import my.accelerator.atf.context.ScenarioContext;

import static my.accelerator.atf.context.DataUserKeys.USER_CREDENTIALS;

@RequiredArgsConstructor
public class StepImplementations {

    private final ScenarioContext scenarioContext;

    @Given("today is Sunday")
    public void today_is_sunday() {
        System.out.println("today is Sunday");
        scenarioContext.put(USER_CREDENTIALS, "Sunday");
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        System.out.println("I ask whether it's Friday yet");
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        System.out.println("I should be told " + string);
        System.out.println("Today is " + scenarioContext.get(USER_CREDENTIALS));
    }
}
