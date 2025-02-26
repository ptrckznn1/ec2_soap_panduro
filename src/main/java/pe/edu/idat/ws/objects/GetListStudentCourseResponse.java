package pe.edu.idat.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getListStudentCourseResponse")
public class GetListStudentCourseResponse {

    @XmlElement(name = "listStudentCourses")
    private List<StudentCoursesoap> listStudentCourses = new ArrayList<>();

    public List<StudentCoursesoap> getListStudentCourses() {
        return listStudentCourses;
    }
}