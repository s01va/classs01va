package com.s01valab.classs01va.service.classes;

import com.s01valab.classs01va.domain.classes.ClassesRepository;
import com.s01valab.classs01va.web.dto.ClassesResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ClassesService {
    private final ClassesRepository classesRepository;

    public List<ClassesResponseDto> findAll() {
        return classesRepository.findAll().stream()
                .map(ClassesResponseDto::new)
                .collect(Collectors.toList());
    }
}
