package pe.edu.idat.ec2_soap_panduro.model.bd;

import jakarta.persistence.*;

@Entity
@Table(name = "StudentCourses")
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "StudentId", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "CourseId", nullable = false)
    private Course course;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}