package com.nest.courseapp_backend.dao;

import com.nest.courseapp_backend.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course,Integer> {
}
