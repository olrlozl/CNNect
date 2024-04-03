package com.ssafy.cnnect.video.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class StudySentenceResponseDto {
    private int order;
    private Long startTime;
    private String content;
    private Double score;
}