package pe.edu.idat.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "postCourseResponse")
public class PostCourseResponse {

    @XmlElement(required = true)
    private Coursesoap course;

    public Coursesoap getCourse() {
        return course;
    }

    public void setCourse(Coursesoap course) {
        this.course = course;
    }
}