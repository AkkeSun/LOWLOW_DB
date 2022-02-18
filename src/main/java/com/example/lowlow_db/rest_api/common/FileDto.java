package com.example.lowlow_db.rest_api.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

/**
 * [ 파일 업로드 정보 ]
 * originalName 원본명
 * uploadName   업로드명
 */
@Embeddable
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class FileDto {
    private String originalName;
    private String uploadName;
}
