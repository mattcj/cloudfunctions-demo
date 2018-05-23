package org.helmetsrequired.demo.cloudfunctions.service;

/**
 * A simple service to get the current message or set a new one
 */
public interface GoodbyeMessageService {

  String getMessage();

  void setMessage(String message);

}
