package contracts.ping


import static org.springframework.cloud.contract.spec.Contract.make

[
  make {

    request {
      name "should return a success ping"
      method GET()
      url "/v1/ping"
    }

    response {
      status OK()
      body([
        message: "contract-pong",
        instant: $(consumer("2018-11-21T16:51:25.940Z"), anyIso8601WithOffset())
      ])
    }

  }
]
