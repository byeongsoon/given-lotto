package com.jb.givenlotto.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class HealthCheckResponse {

    private boolean status;

    private String message;

}
