package org.helmetsrequired.demo.cloudfunctions.app.config;

import org.helmetsrequired.demo.cloudfunctions.service.DefaultGoodbyeMessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration related to the 'service' layer of the code
 */
@Configuration
public class ServiceConfig {

  @Bean
  DefaultGoodbyeMessageService defaultGoodbyeMessageService() {
    return new DefaultGoodbyeMessageService();
  }
}
