package com.example.lowlow_db.rest_api.notice;

import com.example.lowlow_db.rest_api.common.BaseTimeEntity;
import com.example.lowlow_db.rest_api.common.Writer;
import lombok.*;

import javax.persistence.*;

/**
 * [ 공지사항 ]
 *
 * @Column
 * id 고유 식별자
 * title 제목
 * content 내용
 * img 이미지 (최대 6개)
 * writer 작성자
 */
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@ToString @EqualsAndHashCode(of = "id")
public class Notice extends BaseTimeEntity {

    @Id @GeneratedValue
    private Integer id;

    private String title;

    @Embedded
    private Writer writer;

    @Column(columnDefinition = "LONGTEXT")
    private String contents;

}
