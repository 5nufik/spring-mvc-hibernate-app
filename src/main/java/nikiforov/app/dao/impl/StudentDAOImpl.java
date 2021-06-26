package nikiforov.app.dao.impl;

import nikiforov.app.dao.StudentDAO;
import nikiforov.app.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Student> getAllStudents() {
        Session session = sessionFactory.getCurrentSession();

        List<Student> studentList = session.createQuery("from Student",Student.class).getResultList();

        return studentList;
    }

    @Override
    public void saveStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();

        session.save(student);
    }
}