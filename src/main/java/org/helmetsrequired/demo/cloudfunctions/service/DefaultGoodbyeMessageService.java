package org.helmetsrequired.demo.cloudfunctions.service;

/**
 * In-memory implementation of {@link GoodbyeMessageService}
 */
public class DefaultGoodbyeMessageService implements GoodbyeMessageService {

  private String message;

  @Override
  public String getMessage() {
    return message;
  }

  @Override
  public void setMessage(String message) {
    this.message = message;
  }
}
