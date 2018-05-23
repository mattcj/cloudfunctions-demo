package org.helmetsrequired.demo.cloudfunctions.api.domain;

public class GoodbyeRequest {

  private String message;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("GoodbyeRequest{");
    sb.append("message='").append(message).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
