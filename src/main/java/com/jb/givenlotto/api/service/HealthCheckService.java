package com.jb.givenlotto.api.service;

import com.jb.givenlotto.api.dto.HealthCheckResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class HealthCheckService {

    public HealthCheckResponse createResponse() {
        return HealthCheckResponse.builder()
            .status(true)
            .message("서버가 정상 실행 중 입니다.")
            .build();
    }

}
