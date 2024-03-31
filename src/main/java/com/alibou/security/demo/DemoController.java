package com.alibou.security.demo;

import io.swagger.v3.oas.annotations.Hidden;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
@Hidden
public class DemoController {

  @GetMapping
  public ResponseEntity<String> sayHello() {
    return ResponseEntity.ok("Hello from unsecured endpoint");
  }

  @GetMapping("/secured")
  public Object sayHelloSecured(Authentication authentication) {
    return Map.of("user", authentication.getName(),
        "authorities",authentication.getAuthorities());
  }

}
