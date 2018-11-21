package ie.dsch.services.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class QuickstartApplication {

  public static void main(String[] args) {
    SpringApplication.run(QuickstartApplication.class, args);
  }

}
