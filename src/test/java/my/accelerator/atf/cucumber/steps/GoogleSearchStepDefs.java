package my.accelerator.atf.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import my.accelerator.atf.pages.GoogleResultsPage;
import my.accelerator.atf.pages.GoogleSearchPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.MatcherAssert.assertThat;

@AllArgsConstructor
public class GoogleSearchStepDefs {
    private final GoogleSearchPage googleSearchPage;
    private final GoogleResultsPage googleResultsPage;

    @Given("that I have gone to the Google page")
    public void that_i_have_gone_to_the_google_page() {
        googleSearchPage.open();
    }

    @When("I add {string} to the search box")
    public void i_add_to_the_search_box(String string) {
        googleSearchPage.setSearchInput(string);
    }

    @When("click the Search Button")
    public void click_the_search_button() {
        googleSearchPage.search();
    }

    @Then("{string} should be mentioned in the results")
    public void should_be_mentioned_in_the_results(String string) {
        assertThat(googleResultsPage.getResultHeaders(), (everyItem(containsString(string))));
    }
}
