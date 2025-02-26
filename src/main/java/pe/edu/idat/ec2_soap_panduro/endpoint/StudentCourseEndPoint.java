package pe.edu.idat.ec2_soap_panduro.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.idat.ec2_soap_panduro.service.IStudentCourseService;
import pe.edu.idat.ws.objects.*;

@Endpoint
public class StudentCourseEndPoint {

    private static final String NAMESPACE_URI = "http://www.idat.edu.pe/ws/objects";
    private final IStudentCourseService iStudentCourseService;

    public StudentCourseEndPoint(IStudentCourseService iStudentCourseService) {
        this.iStudentCourseService = iStudentCourseService;
    }

    @ResponsePayload
    public GetListStudentCourseResponse obtenerStudentCourses(@RequestPayload GetListStudentCourseRequest request) {
        return iStudentCourseService.obtenerStudentCourses();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStudentCourseRequest")
    @ResponsePayload
    public GetStudentCourseResponse obtenerStudentCoursePorId(@RequestPayload GetStudentCourseRequest request) {
        return iStudentCourseService.obtenerStudentCoursePorId(request);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postStudentCourseRequest")
    @ResponsePayload
    public PostStudentCourseResponse guardarStudentCourse(@RequestPayload PostStudentCourseRequest request) {
        return iStudentCourseService.guardarStudentCourse(request);
    }
}