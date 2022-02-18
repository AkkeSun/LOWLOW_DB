package com.example.lowlow_db.rest_api.member;

import com.example.lowlow_db.rest_api.common.BaseTimeEntity;
import com.example.lowlow_db.rest_api.common.FileDto;
import com.example.lowlow_db.rest_api.common.Writer;
import com.example.lowlow_db.rest_api.common.util.LocalDateConverter;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * [ 교인 정보 ]
 *
 * @Column
 * id 고유 식별자
 * name 이름
 * phoneNumber 전화번호
 * address 주소
 * belong 교구
 * birthDay 생일
 * block 차단유무
 * regiDate 가입일
 * gender 성별
 * churchOfficer 직분
 * image 이미지
 * writer 작성자
 */
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Builder @ToString @EqualsAndHashCode(of = "id")
public class Member extends BaseTimeEntity {

    @Id @GeneratedValue
    private Integer id;

    private String name;

    private String phoneNumber;

    private String belong;

    private LocalDate birthDay;

    private boolean block; // 차단 유무

    @Convert(converter = LocalDateConverter.class)
    private LocalDate regiDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private ChurchOfficer churchOfficer;

    @Embedded
    private FileDto image;

    @Embedded
    private Writer writer;

}
