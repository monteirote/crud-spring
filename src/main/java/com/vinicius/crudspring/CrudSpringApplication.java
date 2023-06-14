package com.vinicius.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vinicius.crudspring.enums.Category;
import com.vinicius.crudspring.models.Course;
import com.vinicius.crudspring.models.Lesson;
import com.vinicius.crudspring.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			for (int i = 0; i < 10; i++) {
				Course c = new Course();
				c.setName("Curso " + (i + 1));
				c.setCategory(Category.FRONT_END);

				Lesson l = new Lesson();
				l.setName("Introdução");
				l.setYoutubeUrl("Nb4uxLxdvxo");

				l.setCourse(c);
				c.getLessons().add(l);

				courseRepository.save(c);
			}

		};
	}

}
