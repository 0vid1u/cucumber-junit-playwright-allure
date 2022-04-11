package my.accelerator.atf.config;

import my.accelerator.atf.context.ScenarioContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class TestConfig {
    @Bean
    public ScenarioContext scenarioContext() {
        return new ScenarioContext();
    }
}
