package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentsController {
    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "students/index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String create(Student student) {
        studentRepository.save(student);
        return "redirect:/students/";
    }

    @RequestMapping(value="/new",method = RequestMethod.GET)
    public String newStudent() {
        return "students/new";
    }

}
