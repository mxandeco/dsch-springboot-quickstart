package ie.dsch.services.quickstart.ping;


import java.time.Instant;

public class Ping {

  private final String message;
  private final Instant instant;

  public Ping(String host, Instant timestamp) {
    this.message = host;
    this.instant = timestamp;
  }

  public String getMessage() {
    return message;
  }

  public Instant getInstant() {
    return instant;
  }

}
