package my.accelerator.atf.cucumber;

import com.github.automatedowl.tools.AllureEnvironmentWriter;
import com.google.common.collect.ImmutableMap;
import io.cucumber.java.BeforeAll;

@SuppressWarnings("unused")
public class CucumberHooks {

    @BeforeAll
    public static void beforeAll() {
        AllureEnvironmentWriter.allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Browser", "Chrome")
                        .build(), System.getProperty("user.dir") + "/allure-results/");
    }
}