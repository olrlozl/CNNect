package com.ssafy.cnnect.result;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ResultCode {
    SUCCESS(200, "정상 처리 되었습니다");

    private final int status;
    private final String message;

}
