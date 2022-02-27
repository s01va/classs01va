package com.s01valab.classs01va.web;

import com.s01valab.classs01va.service.classes.ClassesService;
import com.s01valab.classs01va.web.dto.ClassesResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ClassesApiController {
    private final ClassesService classesService;

    @GetMapping("/api/classes")
    public List<ClassesResponseDto> findAll() {
        return classesService.findAll();
    }
}
