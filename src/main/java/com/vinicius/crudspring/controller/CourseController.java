package com.vinicius.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.crudspring.models.Course;
import com.vinicius.crudspring.repository.CourseRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private CourseRepository CourseRepository;

    @GetMapping
    public @ResponseBody List<Course> list() {
        return CourseRepository.findAll();
    }

}
