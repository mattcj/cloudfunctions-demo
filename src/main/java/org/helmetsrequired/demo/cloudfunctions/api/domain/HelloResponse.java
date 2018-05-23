package org.helmetsrequired.demo.cloudfunctions.api.domain;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class HelloResponse {

  private String greeting;

  private ZonedDateTime time = ZonedDateTime.now(ZoneOffset.UTC);

  public String getGreeting() {
    return greeting;
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }

  public ZonedDateTime getTime() {
    return time;
  }

  public void setTime(ZonedDateTime time) {
    this.time = time;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("HelloResponse{");
    sb.append("greeting='").append(greeting).append('\'');
    sb.append(", time=").append(time);
    sb.append('}');
    return sb.toString();
  }
}
