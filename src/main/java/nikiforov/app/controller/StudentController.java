package nikiforov.app.controller;

import nikiforov.app.entity.Student;
import nikiforov.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * todo Document type StudentController
 */

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping
    public String showAllStudents(Model model) {
        List<Student> allStudents  = studentService.getAllStudents();

        model.addAttribute("allStudents", allStudents);

        return "all-students";
    }
}