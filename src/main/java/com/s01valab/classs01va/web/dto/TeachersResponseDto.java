package com.s01valab.classs01va.web.dto;

import com.s01valab.classs01va.domain.teachers.Teachers;
import lombok.Getter;

@Getter
public class TeachersResponseDto {
    private String ID;
    private String pw;
    private String name;
    private String type;
    private int grade;
    private int classnum;

    public TeachersResponseDto(Teachers entity) {
        this.ID = entity.getID();
        this.pw = entity.getPw();
        this.name = entity.getName();
        this.type = entity.getType();
        this.grade = entity.getGrade();
        this.classnum = entity.getClassnum();
    }
}
