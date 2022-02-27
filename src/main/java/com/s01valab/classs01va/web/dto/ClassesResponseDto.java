package com.s01valab.classs01va.web.dto;

import com.s01valab.classs01va.domain.classes.Classes;
import lombok.Getter;

@Getter
public class ClassesResponseDto {
    private String subjectA;
    private String subjectB;
    private int hourByWeek;
    private boolean isTimeFix;
    private Long teacherSeq;

    public ClassesResponseDto(Classes entity) {
        this.subjectA = entity.getSubjectA();
        this.subjectB = entity.getSubjectB();
        this.hourByWeek = entity.getHourByWeek();
        this.isTimeFix = entity.isTimeFix();
        this.teacherSeq = entity.getTeacherSeq();
    }
}
