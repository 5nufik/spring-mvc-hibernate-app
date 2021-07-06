package nikiforov.app.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(
    name = "students"
)
public class Student {
    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    private int studentID;

    private String studentName;

    private String studentSurname;

    private String studentPatronymic;

    private String studentEmail;

    private Date studentDateOfBirth;

    @ManyToOne
    @JoinColumn (
        name = "studentGroup"
    )
    private Group studentGroup;

    public Student() {
    }

    public Student(String studentName, String studentSurname, String studentPatronymic, String studentEmail, Date studentDateOfBirth, Group studentGroup) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentPatronymic = studentPatronymic;
        this.studentDateOfBirth = studentDateOfBirth;
        this.studentGroup = studentGroup;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getStudentPatronymic() {
        return studentPatronymic;
    }

    public void setStudentPatronymic(String studentPatronymic) {
        this.studentPatronymic = studentPatronymic;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Date getStudentDateOfBirth() {
        return studentDateOfBirth;
    }

    public void setStudentDateOfBirth(Date studentDateOfBirth) {
        this.studentDateOfBirth = studentDateOfBirth;
    }

    public Group getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(Group studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public String toString() {
        return "Student{" +
            "studentID=" + studentID +
            ", studentName='" + studentName + '\'' +
            ", studentSurname='" + studentSurname + '\'' +
            ", studentPatronymic='" + studentPatronymic + '\'' +
            ", studentEmail='" + studentEmail + '\'' +
            ", studentDateOfBirth=" + studentDateOfBirth +
            ", studentGroup=" + studentGroup +
            '}';
    }
}