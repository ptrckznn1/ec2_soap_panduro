package pe.edu.idat.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getListStudentResponse")
public class GetListStudentResponse {

    @XmlElement(name = "liststudents")
    private List<Studentsoap> liststudents = new ArrayList<>();

    public List<Studentsoap> getListstudents() {
        return liststudents;
    }

}
