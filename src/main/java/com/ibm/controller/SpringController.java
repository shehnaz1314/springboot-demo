package com.ibm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.model.Course;
import com.ibm.repository.CourseRepository;

@RequestMapping("/student-course")
@Controller
public class SpringController {
	@Autowired
	private CourseRepository courseRepo;
@GetMapping("/")
public String showForm(Model model) {
	model.addAttribute("course", new Course());
	return "form";
}
	
@PostMapping("/submitCourse")
public String saveUser(@ModelAttribute("course") Course course, Model model) {
	courseRepo.save(course);
	model.addAttribute("data", course);
	return "result";
}

public String deleteStudent(@ModelAttribute("display") Course course, Model model) {
	courseRepo.
	return "displayStudents";
}


/*public String welcome() {
	//using html
	//return "view";
	
	//using jsp
	return "welcome";
}*/
}

