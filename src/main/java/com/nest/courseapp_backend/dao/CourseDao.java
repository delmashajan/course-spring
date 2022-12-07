package com.nest.courseapp_backend.dao;

import com.nest.courseapp_backend.model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDao extends CrudRepository<Course,Integer> {
    @Query(value = "SELECT `id`, `course_date`, `course_description`, `course_title`, `course_venue`, `duration` FROM `courses` WHERE `course_title` = :course_title",nativeQuery = true)
    List<Course> Searchcourse(@Param("course_title") String course_title);
}
