package pe.edu.idat.ec2_soap_panduro.service;

import pe.edu.idat.ws.objects.*;

public interface IStudentCourseService {

    GetListStudentCourseResponse obtenerStudentCourses();

    GetStudentCourseResponse obtenerStudentCoursePorId(GetStudentCourseRequest request);

    PostStudentCourseResponse guardarStudentCourse(PostStudentCourseRequest request);
}