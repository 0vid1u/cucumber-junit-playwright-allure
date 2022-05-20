package my.accelerator.atf.pages;

import com.microsoft.playwright.Page;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class GoogleSearchPage {

    @Value("${test.application.base.uri}")
    private String googleSearchUrl;

    @Autowired private Page page;

    private static final String SEARCH_INPUT = "input[name='q']";
    private static final String SEARCH_BUTTON = "input[value='Căutare Google']";

    public void open() {
        page.navigate(googleSearchUrl, new Page.NavigateOptions().setTimeout(30000));
    }

    public void setSearchInput(String searchExpression) {
        page.fill(SEARCH_INPUT, searchExpression);
    }

    public void search() {
        page.waitForNavigation(() -> { // Waits for the next navigation
            page.locator(SEARCH_BUTTON).first().click();
        });
    }
}
