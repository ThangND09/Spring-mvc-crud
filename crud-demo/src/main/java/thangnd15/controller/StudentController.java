package thangnd15.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import thangnd15.dao.StudentDAO;
import thangnd15.dao.StudentDAOImpl;
import thangnd15.entity.Student;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentDAO studentDAOImpl;
	
	@RequestMapping("/list")
	public String getStudent(Model model) {
		
		Student students = studentDAOImpl.getStudent();
		
		model.addAttribute("students", students);
		
		return "student";
		
	}
}
