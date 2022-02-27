package com.s01valab.classs01va.domain.teachers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeachersRepository extends JpaRepository<Teachers, Long> {
    @Query("SELECT t FROM Teachers t")
    List<Teachers> findAll();
}
