package my.accelerator.atf.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.spring.CucumberContextConfiguration;
import my.accelerator.atf.config.TestConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@CucumberContextConfiguration
@ContextConfiguration(classes = {TestConfig.class},
        loader = AnnotationConfigContextLoader.class)
public class ExecutionHooks {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("-> before all");
    }

    @Before
    public void beforeEach() {
        System.out.println("--> before each");
    }

    @BeforeStep
    public void beforeEachStep() {
        System.out.println("--> before each step");
    }

    @AfterStep
    public void afterEachStep() {
        System.out.println("--> after each step");
    }

    @After
    public void afterEach() {
        System.out.println("--> after each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("-> after all");
    }
}
