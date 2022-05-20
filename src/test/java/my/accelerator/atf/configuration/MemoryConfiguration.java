package my.accelerator.atf.configuration;

import my.accelerator.atf.memory.Memory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemoryConfiguration {
    @Bean
    public Memory memory() {
        return new Memory();
    }
}
