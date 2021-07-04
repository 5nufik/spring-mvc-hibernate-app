package nikiforov.app.dao;

import nikiforov.app.entity.Student;

import java.util.List;

public interface StudentDAO {
    List<Student> getAllStudents();

    void saveStudent(Student student);

    Student getStudent(int id);
}