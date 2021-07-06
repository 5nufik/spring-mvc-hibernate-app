package nikiforov.app.service.impl;

import nikiforov.app.dao.StudentDAO;
import nikiforov.app.entity.Student;
import nikiforov.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    @Override
    @Transactional
    public void saveStudent(Student student) {
        studentDAO.saveStudent(student);
    }

    @Override
    @Transactional
    public Student getStudentById(int studentId) {
        return studentDAO.getStudentById(studentId);
    }

    @Override
    @Transactional
    public void deleteStudent(int studentId) {
        studentDAO.deleteStudent(studentId);
    }
}