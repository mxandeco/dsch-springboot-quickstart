package ie.dsch.services.quickstart.ping;

import java.time.Instant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PingService {

  private final PingProperties properties;

  @Autowired
  public PingService(PingProperties properties) {
    this.properties = properties;
  }

  public Ping ping() {
    return new Ping(properties.getMessage(), Instant.now());
  }

}
