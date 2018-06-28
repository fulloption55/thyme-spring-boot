package com.example.thymespringboot.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.thymeleaf.spring5.SpringTemplateEngine;

@Log4j2
@Component
public class ApplicationRunnerConfig implements CommandLineRunner {

    @Autowired
    private DatabaseMessageSource databaseMessageSource;

    @Autowired
    private SpringTemplateEngine springTemplateEngine;

    @Override
    public void run(String... strings) {
        setCustomerSpringTemplateEngine();
    }

    private void setCustomerSpringTemplateEngine() {
        springTemplateEngine.setTemplateEngineMessageSource(databaseMessageSource);
        log.info("Setup CustomerSpringTemplateEngine");
    }
}
