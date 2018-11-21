package ie.dsch.services.quickstart.ping;

import static org.apache.commons.lang3.RandomStringUtils.random;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class PingServiceTest {

  private PingProperties pingProperties;

  private PingService pingService;

  @Before
  public void before() {
    pingProperties = new PingProperties();
    pingProperties.setMessage(random(10));
    pingService = new PingService(pingProperties);
  }

  @Test
  public void should_ReturnAPing_For_GivenPropeties() {
    assertThat(pingService.ping())
      .extracting("message", "instant")
      .contains(pingProperties.getMessage())
      .doesNotContainNull();
  }

}
