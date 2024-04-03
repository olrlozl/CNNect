package com.ssafy.cnnect.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class JoinRequestDto {
    private String userNickname;
    private String userEmail;
    private String userPassword;
}
