package org.helmetsrequired.demo.cloudfunctions.app.config;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.helmetsrequired.demo.cloudfunctions.api.domain.GoodbyeRequest;
import org.helmetsrequired.demo.cloudfunctions.api.domain.GoodbyeResponse;
import org.helmetsrequired.demo.cloudfunctions.api.domain.HelloRequest;
import org.helmetsrequired.demo.cloudfunctions.api.domain.HelloResponse;
import org.helmetsrequired.demo.cloudfunctions.service.GoodbyeMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration of the functions we expose.
 *
 * Provides the function(s) for the AWS lambda to run.
 * <p/>
 * Note: by default a bean called 'function' will be the one mapped to the {@link
 * org.helmetsrequired.demo.cloudfunctions.handler.Handler}. As an alternative you can specify the
 * function to link via the 'function.name' property or as an environment variable 'FUNCTION_NAME'.
 * <p/>
 * Here we have defined multiple function beans.  The intent is to allow us to switch between them
 * via the 'FUNCTION_NAME' environment variable.  As such we can deploy the same jarfile as multiple
 * lambdas by simply specifying which 'FUNCTION_NAME' each lambda should run.
 */
@Configuration
public class FunctionConfig {


  @Autowired
  private GoodbyeMessageService goodbyeMessageService;

  @Bean
  Function<HelloRequest, HelloResponse> hello() {
    return helloRequest -> {
      final HelloResponse helloResponse = new HelloResponse();
      helloResponse.setGreeting(String.format("Hello %s", helloRequest.getName()));
      return helloResponse;
    };
  }

  @Bean
  Supplier<GoodbyeResponse> goodbye() {
    return () -> {
      final GoodbyeResponse goodbyeResponse = new GoodbyeResponse();
      goodbyeResponse.setMessage(goodbyeMessageService.getMessage());
      return goodbyeResponse;
    };
  }

  @Bean
  Consumer<GoodbyeRequest> setGoodbyeMessage() {
    return goodbyeRequest -> goodbyeMessageService.setMessage(goodbyeRequest.getMessage());
  }

}
