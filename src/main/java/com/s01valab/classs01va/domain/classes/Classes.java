package com.s01valab.classs01va.domain.classes;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @Column(nullable = false)
    private String subjectA;

    @Column(nullable = true)
    private String subjectB;

    @Column(nullable = false)
    private int hourByWeek;

    @Column(nullable = false)
    private boolean isTimeFix = false;

    @Column(nullable = true)
    private Long teacherSeq;
}
