package com.learn.web.springmvc.controllers;

import com.learn.web.springmvc.model.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/welcome")
public class HelloController {
 
	@RequestMapping(method = RequestMethod.GET)
   public String printWelcome(ModelMap model, @RequestHeader(value="User-Agent") String userAgent) {

      model.addAttribute("userAgent", userAgent);
      model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";
 
	}

//   produces="application/json"

   @RequestMapping(value = "/students", method = RequestMethod.GET, produces="application/json")
   @ResponseBody
   public List<Student> getStudents(){
      List<Student> studentList = new ArrayList<Student>();
      Student student = new Student();
      student.setAge(33);
      student.setName("Dima");
      studentList.add(student);
      Student student2 = new Student();
      student2.setAge(23);
      student2.setName("Dima2");
      studentList.add(student2);

      return studentList;
   }

 
}