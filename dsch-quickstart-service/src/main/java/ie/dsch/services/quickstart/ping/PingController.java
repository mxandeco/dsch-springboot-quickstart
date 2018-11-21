package ie.dsch.services.quickstart.ping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class PingController {

  private final PingService pingService;

  @Autowired
  public PingController(PingService pingService) {
    this.pingService = pingService;
  }

  @GetMapping("/ping")
  public ResponseEntity<Ping> ping() {
    return ResponseEntity.ok(pingService.ping());
  }


}
