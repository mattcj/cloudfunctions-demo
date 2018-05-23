package org.helmetsrequired.demo.cloudfunctions.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entrypoint for the spring-boot application
 */
@SpringBootApplication
public class CloudFunctionDemoApp {

  public static void main(String[] args) {
    SpringApplication.run(CloudFunctionDemoApp.class, args);
  }
}
