package com.jorgeadolfo.codechallenge.codechallenge.controllers;

import com.jorgeadolfo.codechallenge.codechallenge.dto.HealthCheckOutboundDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api")
    public ResponseEntity<HealthCheckOutboundDto> getHealthCheck() {
        var result = HealthCheckOutboundDto.builder().status("ok").build();

        return ResponseEntity.ok(result);
    }
}
