package pe.edu.idat.ec2_soap_panduro.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.idat.ec2_soap_panduro.service.ICourseService;
import pe.edu.idat.ws.objects.*;

@Endpoint
public class CourseEndPoint {

    private static final String NAMESPACE_URI = "http://www.idat.edu.pe/ws/objects";
    private final ICourseService iCourseService;

    public CourseEndPoint(ICourseService iCourseService) {
        this.iCourseService = iCourseService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getListCourseRequest")
    @ResponsePayload
    public GetListCourseResponse obtenerCourses(@RequestPayload GetListCourseRequest request) {
        return iCourseService.obtenerCourses();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCourseRequest")
    @ResponsePayload
    public GetCourseResponse obtenerCoursePorId(@RequestPayload GetCourseRequest request) {
        return iCourseService.obtenerCoursePorId(request);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postCourseRequest")
    @ResponsePayload
    public PostCourseResponse guardarCourse(@RequestPayload PostCourseRequest request) {
        return iCourseService.guardarCourse(request);
    }
}