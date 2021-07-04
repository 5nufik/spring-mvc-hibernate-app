package nikiforov.app.service;

import nikiforov.app.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    void saveStudent(Student student);

    Student getStudent(int id);
}