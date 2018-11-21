package ie.dsch.services.quickstart.ping;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("dsch.ping")
public class PingProperties {

  private String message = "default-message";

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}
