package pe.edu.idat.ec2_soap_panduro.util;

import org.springframework.stereotype.Component;
import pe.edu.idat.ec2_soap_panduro.model.bd.StudentCourse;
import pe.edu.idat.ws.objects.StudentCoursesoap;

@Component
public class StudentCourseConvert {

    public StudentCourse convertirStudentCourseBD(StudentCoursesoap studentCourseSoap) {
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setId(studentCourseSoap.getId());
        return studentCourse;
    }

    public StudentCoursesoap convertirStudentCourseSoap(StudentCourse studentCourse) {
        StudentCoursesoap studentCourseSoap = new StudentCoursesoap();
        studentCourseSoap.setId(studentCourse.getId());
        studentCourseSoap.setStudentId(studentCourse.getStudent().getId());
        studentCourseSoap.setCourseId(studentCourse.getCourse().getId());
        return studentCourseSoap;
    }
}