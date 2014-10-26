package com.xeiam.xchange.coinsetter.dto.clientsession.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinsetterClientSessionResponse {

  private final String message;
  private final String requestStatus;

  /**
   * @param message If success, message will be "OK". Otherwise, it will be a description of the issue.
   * @param requestStatus Either "SUCCESS" or "FAILURE"
   */
  public CoinsetterClientSessionResponse(@JsonProperty("message") String message, @JsonProperty("requestStatus") String requestStatus) {

    this.message = message;
    this.requestStatus = requestStatus;
  }

  public String getMessage() {

    return message;
  }

  public String getRequestStatus() {

    return requestStatus;
  }

  @Override
  public String toString() {

    return "CoinsetterClientSessionResponse [message=" + message + ", requestStatus=" + requestStatus + "]";
  }

}
