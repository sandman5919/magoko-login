package org.deepinthink.magoko.login.server.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class LoginServerEnableMarkerConfiguration {

  @Bean
  public Marker loginServerEnableMarker() {
    return new Marker();
  }

  class Marker {}
}
