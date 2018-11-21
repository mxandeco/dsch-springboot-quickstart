package ie.dsch.services.quickstart;

import ie.dsch.services.quickstart.ping.PingProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(PingProperties.class)
public class QuickstartApplication {

  public static void main(String[] args) {
    SpringApplication.run(QuickstartApplication.class, args);
  }

}
