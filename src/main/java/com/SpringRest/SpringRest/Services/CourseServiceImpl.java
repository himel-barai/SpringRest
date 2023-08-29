package com.SpringRest.SpringRest.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRest.SpringRest.Dao.CourseDao;
import com.SpringRest.SpringRest.Entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	public CourseDao courseDao;
	List<Course> list;

	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(101, "Java", "Java is a high level programming langauge"));
		list.add(new Course(102, "C++", "C++ is a high level programming langauge"));
	}

	@Override
	public List<Course> getCourses() {

		return courseDao.findAll();
	}

	@Override
	public Course getCoursesById(long courseId) {
		Optional<Course> findId = courseDao.findById(courseId);
		
		//Course course = findId.get();
		return findId.get();
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course deleteCourse(long courseId) {
		courseDao.deleteById(courseId);
		return null;
	}

}
