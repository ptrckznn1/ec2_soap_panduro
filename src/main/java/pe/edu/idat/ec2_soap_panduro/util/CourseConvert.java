package pe.edu.idat.ec2_soap_panduro.util;

import org.springframework.stereotype.Component;
import pe.edu.idat.ec2_soap_panduro.model.bd.Course;
import pe.edu.idat.ws.objects.Coursesoap;

@Component
public class CourseConvert {

    public Course convertirCursoBD(Coursesoap coursesoap){
        Course course = new Course();
        course.setId(coursesoap.getIdcurso());
        course.setName(coursesoap.getNomcurso());
        course.setCredit(coursesoap.getCredito());
        course.setDescription(coursesoap.getDescription());
        return course;
    }

    public Coursesoap convertirCursoSoap(Course course){
        Coursesoap coursesoap = new Coursesoap();
        coursesoap.setIdcurso(course.getId());
        coursesoap.setNomcurso(course.getName());
        coursesoap.setCredito(course.getCredit());
        coursesoap.setDescription(course.getDescription());
        return coursesoap;
    }
}