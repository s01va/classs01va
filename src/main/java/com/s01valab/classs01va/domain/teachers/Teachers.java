package com.s01valab.classs01va.domain.teachers;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @Column
    private String ID;

    @Column
    private String pw;

    @Column(length = 10, nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;

    @Column
    private int grade;

    @Column
    private int classnum;
}
