package org.helmetsrequired.demo.cloudfunctions.api.domain;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GoodbyeResponse {

  private String message;

  private ZonedDateTime time = ZonedDateTime.now(ZoneOffset.UTC);

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ZonedDateTime getTime() {
    return time;
  }

  public void setTime(ZonedDateTime time) {
    this.time = time;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("GoodbyeResponse{");
    sb.append("message='").append(message).append('\'');
    sb.append(", time=").append(time);
    sb.append('}');
    return sb.toString();
  }
}
