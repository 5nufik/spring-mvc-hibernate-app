package nikiforov.app.controller;

import nikiforov.app.entity.Student;
import nikiforov.app.service.GroupService;
import nikiforov.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private GroupService groupService;

    @RequestMapping
    public String showAllStudents(Model model) {
        List<Student> allStudents  = studentService.getAllStudents();

        model.addAttribute("allStudents", allStudents);

        return "all-students";
    }

    @RequestMapping("/new")
    public String showNewStudent(Model model) {

        model.addAttribute("student", new Student());

        model.addAttribute("groups", groupService.getAllGroups());

        return "new-student";
    }

    @RequestMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student student) {
        student.setStudentGroup(groupService.getGroupByName(student.getStudentGroup().getGroupName()));
        studentService.saveStudent(student);

        return "redirect:/students";
    }

    @RequestMapping("/edit")
    public String editStudent(@RequestParam("studentID") int studentId, Model model) {

        model.addAttribute("student", studentService.getStudentById(studentId));
        model.addAttribute("groups", groupService.getAllGroups());

        return "new-student";
    }

    @RequestMapping("/delete")
    public String deleteStudent(@RequestParam("studentID") int studentId) {
        studentService.deleteStudent(studentId);

        return "redirect:/students";
    }
}