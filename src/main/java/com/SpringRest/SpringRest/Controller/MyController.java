package com.SpringRest.SpringRest.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.SpringRest.Entity.Course;
import com.SpringRest.SpringRest.Services.CourseService;

@RestController
public class MyController {
	@Autowired
	public CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to the courses Application which build with Rest Api!";
	}

	// get all the courses

	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();
	}
	// get single course by id
	@GetMapping("/courses/{courseId}")
	public Course getCoursesById(@PathVariable String courseId) {
		return this.courseService.getCoursesById(Long.parseLong(courseId));
	}
	// add course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {

		return this.courseService.addCourse(course);
	}
	//update course
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}
	//delete course
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpSession> deleteCoyurse(@PathVariable long courseId){
		try {
			this.courseService.deleteCourse(courseId);
			return new ResponseEntity<>(HttpStatus.OK);
			
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
