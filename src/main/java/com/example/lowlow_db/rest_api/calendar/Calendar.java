package com.example.lowlow_db.rest_api.calendar;

import com.example.lowlow_db.rest_api.common.BaseTimeEntity;
import com.example.lowlow_db.rest_api.common.Writer;
import com.example.lowlow_db.rest_api.common.util.LocalDateConverter;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * [ Calendar ]
 *
 * @Column
 * id 고유 식별자
 * title 내용
 * start 시작일
 * end 종료일
 */
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@ToString @EqualsAndHashCode(of = "id")
public class Calendar extends BaseTimeEntity {

    @Id @GeneratedValue
    private Integer id;

    @Embedded
    private Writer writer;

    private String title;

    @Convert(converter = LocalDateConverter.class)
    private LocalDate start;

    @Convert(converter = LocalDateConverter.class)
    private LocalDate end;

}
