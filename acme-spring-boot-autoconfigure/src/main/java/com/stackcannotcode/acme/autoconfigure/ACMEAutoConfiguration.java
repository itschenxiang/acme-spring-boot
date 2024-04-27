package com.stackcannotcode.acme.autoconfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = {ACMEProperties.class})
public class ACMEAutoConfiguration {

    @Autowired
    private ACMEProperties acmeProperties;

    @Bean
    public CommandLineRunner acmeCommandLineRunner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                System.out.println(acmeProperties.getSlogan());
            }
        };
    }

}
