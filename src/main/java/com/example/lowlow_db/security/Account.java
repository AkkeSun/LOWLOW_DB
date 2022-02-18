package com.example.lowlow_db.security;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
@AllArgsConstructor  @NoArgsConstructor @Builder
public class Account {

    @Id @GeneratedValue
    private Long id;

    private String username;


    private String password;

    private boolean block; // 차단 유무

    private String belong; // 교구 : 교구 리더인 경우 입력

    @JsonManagedReference // 순환참조 방지 (부모 엔티티에 붙이기)
    @ManyToOne(fetch = FetchType.EAGER, cascade={CascadeType.ALL})
    private Role userRole;

}