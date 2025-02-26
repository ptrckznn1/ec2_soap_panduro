package pe.edu.idat.ws.objects;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getListCourseResponse")
@XmlType(name = "", propOrder = {
        "listcourses"
})
public class GetListCourseResponse {

    @XmlElement(required = true)
    protected List<Coursesoap> listcourses;

    public List<Coursesoap> getListcourses() {
        if (listcourses == null) {
            listcourses = new ArrayList<>();
        }
        return this.listcourses;
    }

    public void setListcourses(List<Coursesoap> listcourses) {
        this.listcourses = listcourses;
    }
}