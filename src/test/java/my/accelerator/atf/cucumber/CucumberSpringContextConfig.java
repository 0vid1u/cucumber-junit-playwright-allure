package my.accelerator.atf.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;

@Lazy
@CucumberContextConfiguration
@SpringBootTest
public class CucumberSpringContextConfig {
}