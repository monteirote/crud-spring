package com.vinicius.crudspring.dto.mapper;

import org.springframework.stereotype.Component;

import com.vinicius.crudspring.dto.CourseDTO;
import com.vinicius.crudspring.enums.Category;
import com.vinicius.crudspring.models.Course;

@Component
public class CourseMapper {
    
    public CourseDTO toDTO(Course course) {
        if (course == null) {
            return null;
        }
        return new CourseDTO(course.getId(), course.getName(), "Front-end");
    }

    public Course toEntity(CourseDTO dto) {

        if (dto == null) {
            return null;
        }

        Course course = new Course();
        if (dto.id() != null) {
            course.setId(dto.id());
        }
        course.setName(dto.name());
        course.setCategory(Category.FRONT_END);
        return course;
    }
}
