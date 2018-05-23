package org.helmetsrequired.demo.cloudfunctions.handler;

import org.springframework.cloud.function.adapter.aws.SpringBootStreamHandler;

/**
 * The entrypoint for AWS Lambda functions.
 * Declare this class as the 'Handler' when creating your lambda
 *
 * Note we used {@link SpringBootStreamHandler} as opposed to the
 * {@link org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler} as we
 * wanted to use the spring configured ObjectMapper for serialization/deserialization
 */
public class Handler extends SpringBootStreamHandler {
}
