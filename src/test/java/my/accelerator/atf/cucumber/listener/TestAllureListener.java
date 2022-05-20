package my.accelerator.atf.cucumber.listener;

import com.microsoft.playwright.Page;
import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.Status;
import io.cucumber.plugin.event.TestCaseFinished;
import io.cucumber.plugin.event.TestCaseStarted;
import io.cucumber.plugin.event.TestRunFinished;
import io.cucumber.plugin.event.TestRunStarted;
import io.cucumber.plugin.event.TestStepFinished;
import io.cucumber.plugin.event.TestStepStarted;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import my.accelerator.atf.cucumber.StaticContextAccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.io.ByteArrayInputStream;

@NoArgsConstructor
public class TestAllureListener implements ConcurrentEventListener {

    @Override
    public void setEventPublisher(EventPublisher eventPublisher) {
        eventPublisher.registerHandlerFor(TestRunStarted.class, this::testRunStarted);
        eventPublisher.registerHandlerFor(TestRunFinished.class, this::testRunFinished);
        eventPublisher.registerHandlerFor(TestCaseStarted.class, this::handleCaseStarted);
        eventPublisher.registerHandlerFor(TestCaseFinished.class, this::handleCaseFinished);
        eventPublisher.registerHandlerFor(TestStepStarted.class, this::handleStepStarted);
        eventPublisher.registerHandlerFor(TestStepFinished.class, this::handleStepFinished);
    }

    private void testRunFinished(final TestRunFinished event) {
    }

    private void testRunStarted(final TestRunStarted event) {
    }

    private void handleCaseStarted(TestCaseStarted t) {

    }

    private void handleCaseFinished(TestCaseFinished t) {

    }

    private void handleStepStarted(TestStepStarted t) {

    }

    private void handleStepFinished(TestStepFinished t) {
        if (Status.FAILED.equals(t.getResult().getStatus())) {
            Allure.addAttachment(t.getTestStep().getId().toString(), new ByteArrayInputStream(captureScreenshot()));
        }
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] captureScreenshot() {
        return StaticContextAccessor.getBean(Page.class).screenshot(new Page.ScreenshotOptions().setFullPage(true));
    }
}
