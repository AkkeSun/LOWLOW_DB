package com.example.lowlow_db.rest_api.basicInfo;

import com.example.lowlow_db.rest_api.common.BaseTimeEntity;
import com.example.lowlow_db.rest_api.common.FileDto;
import com.example.lowlow_db.rest_api.common.Writer;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@ToString @EqualsAndHashCode(of = "id")
public class BasicInfo extends BaseTimeEntity {

    @Id @GeneratedValue
    private Integer id;

    private String mainTitle;

    private String info;

    private String name;

    private String senior_pastor_name;

    private String basicAddress;

    private String detailAddress;

    private String callNumber;

    private String kakaoPage;

    private String youtubeURL;

    private String instagram;

    private String blog;
    @Embedded
    private Writer writer;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "Info1_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "Info1_UploadName")),
    })
    private FileDto infoImage1;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "Info2_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "Info2_UploadName")),
    })
    private FileDto infoImage2;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "Info3_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "Info3_UploadName")),
    })
    private FileDto infoImage3;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "Info4_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "Info4_UploadName")),
    })
    private FileDto infoImage4;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "Info5_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "Info5_UploadName")),
    })
    private FileDto infoImage5;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "Info6_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "Info6_UploadName")),
    })
    private FileDto infoImage6;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "Car1_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "Car1_UploadName")),
    })
    private FileDto carouselImg1;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "Car2_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "Car2_UploadName")),
    })
    private FileDto carouselImg2;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "Car3_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "Car3_UploadName")),
    })
    private FileDto carouselImg3;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "Car4_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "Car4_UploadName")),
    })
    private FileDto carouselImg4;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "Car5_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "Car5_UploadName")),
    })
    private FileDto carouselImg5;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "Car6_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "Car6_UploadName")),
    })
    private FileDto carouselImg6;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "Chart1_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "Chart1_UploadName")),
    })
    private FileDto organizationChart1;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "Chart2_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "Chart2_UploadName")),
    })
    private FileDto organizationChart2;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "originalName", column = @Column(name = "Chart3_OriginalName")),
            @AttributeOverride(name = "uploadName",   column = @Column(name = "Chart3_UploadName")),
    })
    private FileDto organizationChart3;
}
