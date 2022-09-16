package com.md;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.md.entity.Student;

@Controller
public class HelloController {

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("register");
		return modelAndView;
	}

	// Registration Using ModelMap
	@RequestMapping("/reg")
	public String registerModel() {
		return "register";
	}

	/*
	 * // Registeration using ModelAndView
	 * 
	 * @RequestMapping(value = "/registration", method = RequestMethod.POST) public
	 * ModelAndView registration(@ModelAttribute("student") Student student) {
	 * ModelAndView modelAndView = new ModelAndView(); System.out.println(student);
	 * modelAndView.setViewName("registeredstudent"); return modelAndView; }
	 */
	
	//returning String using @ResponseBody Annotation. viewResolver considers the returned string is not a View Name.
	@RequestMapping("/test")
	public @ResponseBody String testing() {
		return "Wow, Awesome";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registration(@ModelAttribute("student") Student student, ModelMap model) {
		System.out.println(student);
		model.addAttribute("student",student);
		return "registeredstudent";
	}

	@RequestMapping("/urlparams")
	public ModelAndView urlparams(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam(value = "age", required = false, defaultValue = "23") int age) {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("Name", name);
		modelAndView.addObject("Id", id);
		modelAndView.addObject("Age", age);
		modelAndView.setViewName("params");
		return modelAndView;
	}

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("id", 1);
		modelAndView.addObject("name", "MD");
		modelAndView.addObject("age", 23);
		modelAndView.setViewName("hello");

		Student student = new Student();
		student.setAge(24);
		student.setName("Subbu");
		student.setId(2);
		modelAndView.addObject("student", student);

		List<Student> students = new ArrayList<Student>();

		Student student1 = new Student();
		student1.setAge(23);
		student1.setName("Rahul");
		student1.setId(11);

		Student student2 = new Student();
		student2.setAge(24);
		student2.setName("Partha");
		student2.setId(12);

		Student student3 = new Student();
		student3.setAge(25);
		student3.setName("Shirisha");
		student3.setId(13);

		students.add(student1);
		students.add(student2);
		students.add(student3);
		modelAndView.addObject("students", students);

		return modelAndView;
	}
}
