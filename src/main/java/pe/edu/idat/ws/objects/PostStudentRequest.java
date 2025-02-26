package pe.edu.idat.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "postStudentRequest")
public class PostStudentRequest {

    @XmlElement(required = true)
    private Studentsoap student;

    public Studentsoap getStudent() {
        return student;
    }

    public void setStudent(Studentsoap student) {
        this.student = student;
    }
}