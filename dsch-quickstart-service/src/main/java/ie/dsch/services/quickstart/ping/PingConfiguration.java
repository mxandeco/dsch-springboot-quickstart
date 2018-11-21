package ie.dsch.services.quickstart.ping;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(PingProperties.class)
public class PingConfiguration {

}
