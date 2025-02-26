package pe.edu.idat.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studentCourseSoap", propOrder = {
        "id",
        "studentId",
        "courseId"
})
public class StudentCoursesoap {

    protected int id;
    @XmlElement(required = true)
    protected int studentId;
    @XmlElement(required = true)
    protected int courseId;

    public int getId() {
        return id;
    }

    public void setId(int value) {
        this.id = value;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int value) {
        this.studentId = value;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int value) {
        this.courseId = value;
    }
}