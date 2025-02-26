package pe.edu.idat.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "postStudentCourseResponse")
public class PostStudentCourseResponse {

    @XmlElement(required = true)
    private StudentCoursesoap studentCourse;

    public StudentCoursesoap getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(StudentCoursesoap studentCourse) {
        this.studentCourse = studentCourse;
    }
}