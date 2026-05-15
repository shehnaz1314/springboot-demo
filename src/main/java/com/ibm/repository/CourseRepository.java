package com.ibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

}
