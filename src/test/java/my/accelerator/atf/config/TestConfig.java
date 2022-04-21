package my.accelerator.atf.config;

import my.accelerator.atf.context.ScenarioContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class TestConfig {

    @Value("${browser}")
    private String browser;

    @Value("${test.application.base.uri}")
    private String baseUrl;

    @Bean
    public ScenarioContext scenarioContext() {
        System.out.println("Browser: " + browser + " Base url: " + baseUrl);
        return new ScenarioContext();
    }
}
