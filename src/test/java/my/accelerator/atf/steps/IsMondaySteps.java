package my.accelerator.atf.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class IsMondaySteps {
    @Given("today is Sunday")
    public void today_is_sunday() {
        System.out.println("Given today is Sunday");
    }

    @When("I ask whether it's Monday yet")
    public void i_ask_whether_it_s_monday_yet() {
        System.out.println("When I ask whether it's Monday yet");
    }
}
