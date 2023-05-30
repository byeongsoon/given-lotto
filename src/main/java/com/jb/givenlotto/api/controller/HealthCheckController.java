package com.jb.givenlotto.api.controller;

import com.jb.givenlotto.api.dto.HealthCheckResponse;
import com.jb.givenlotto.api.service.HealthCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/health")
public class HealthCheckController {

    private final HealthCheckService healthCheckService;

    @GetMapping
    public ResponseEntity<HealthCheckResponse> healthCheck() {
        HealthCheckResponse healthCheckResponse = healthCheckService.createResponse();
        return ResponseEntity.ok(healthCheckResponse);
    }

}
