package pe.edu.idat.ec2_soap_panduro.service;

import pe.edu.idat.ws.objects.*;

public interface ICourseService {

    GetListCourseResponse obtenerCourses();

    GetCourseResponse obtenerCoursePorId(GetCourseRequest request);

    PostCourseResponse guardarCourse(PostCourseRequest request);
}