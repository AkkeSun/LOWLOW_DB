package com.example.lowlow_db.rest_api.weekly;

import com.example.lowlow_db.rest_api.common.BaseTimeEntity;
import com.example.lowlow_db.rest_api.common.FileDto;
import com.example.lowlow_db.rest_api.common.Writer;
import lombok.*;

import javax.persistence.*;

/**
 * [ 주보 ]
 *
 * @Column
 * id 고유 식별자
 * title 제목
 * weeklyDate 주보의 해당일
 * writer 작성자
 * img 주보 이미지
 */
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@ToString @EqualsAndHashCode(of = "id")
public class Weekly extends BaseTimeEntity {

    @Id @GeneratedValue
    private Integer id;

    private String title;

    private String weeklyDate;

    @Embedded
    private Writer writer;

    @Embedded

    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "img1_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "img1_UploadName")),
    })
    private FileDto img1;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "img2_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "img2_UploadName")),
    })
    private FileDto img2;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "img3_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "img3_UploadName")),
    })
    private FileDto img3;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "img4_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "img4_UploadName")),
    })
    private FileDto img4;
}
