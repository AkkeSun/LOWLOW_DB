package com.example.lowlow_db.rest_api.summernote;

import com.example.lowlow_db.rest_api.common.FileDto;
import com.example.lowlow_db.rest_api.common.Writer;
import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * [ 서머노트 파일 업로드 entity ]
 *  image : 업로드 파일 이름
 *  writer : 작성자
 */
@Entity @Getter @Setter
@NoArgsConstructor
@AllArgsConstructor @Builder
@ToString @EqualsAndHashCode(of = "id")
public class SummerNoteImg {

    @Id
    @GeneratedValue
    private Integer id;
    
    @Embedded
    private FileDto image;

    @Embedded
    private Writer writer;
}
