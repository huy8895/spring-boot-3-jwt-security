package com.alibou.security.demo;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/management")
@Tag(name = "Management")
public class ManagementControllerV2 {

    @GetMapping
    public String get(Authentication authentication) {
        return "GET:: management controller v2"
            + " | " + authentication.getName()
            + " | " + authentication.getAuthorities();
    }
}
