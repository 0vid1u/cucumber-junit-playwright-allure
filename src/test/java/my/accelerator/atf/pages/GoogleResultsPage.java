package my.accelerator.atf.pages;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GoogleResultsPage {
    @Autowired private Page page;

    private static final String RESULT_HEADERS = "a > h3";

    public List<String> getResultHeaders() {
        return page.querySelectorAll(RESULT_HEADERS).stream()
                .map(ElementHandle::innerText)
                .toList();
    }
}
