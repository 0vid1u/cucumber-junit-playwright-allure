package my.accelerator.atf.steps;

import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class IsWednesdaySteps {
    @When("I ask whether it's Wednesday yet")
    public void i_ask_whether_it_s_wednesday_yet() {
        System.out.println("When I ask whether it's Wednesday yet");
        Assertions.assertEquals("Nope", "Yes");
    }
}
