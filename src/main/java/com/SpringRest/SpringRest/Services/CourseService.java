package com.SpringRest.SpringRest.Services;

import java.util.List;
import com.SpringRest.SpringRest.Entity.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getCoursesById(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public Course deleteCourse(long courseId);

}
