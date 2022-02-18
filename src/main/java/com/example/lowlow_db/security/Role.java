package com.example.lowlow_db.security;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter @Setter @ToString(exclude = {"accounts","resourcesSet"})
@NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode(of = "id") @Builder
public class Role implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String roleName;

    private String roleDesc;

    private int roleNum;

    private boolean block; // 차단 유무

}