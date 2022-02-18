package com.example.lowlow_db.rest_api.gallery;

import com.example.lowlow_db.rest_api.common.BaseTimeEntity;
import com.example.lowlow_db.rest_api.common.Writer;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * [ 갤러리 ]
 *
 * @Column
 * id 고유 식별자
 * title 제목
 * img 이미지 (최대 6개)
 * writer 작성자
 */
@Entity
@DynamicUpdate
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@ToString @EqualsAndHashCode(of = "id")
public class Gallery extends BaseTimeEntity {

    @Id @GeneratedValue
    private Integer id;

    private String title;
    
    @Embedded
    private Writer writer;

    @Column(columnDefinition = "LONGTEXT")
    private String contents;

}
