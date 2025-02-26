package pe.edu.idat.ec2_soap_panduro.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.idat.ec2_soap_panduro.service.IStudentService;
import pe.edu.idat.ws.objects.*;

@Endpoint
public class StudentEndPoint {

    private static final String NAMESPACE_URI = "http://www.idat.edu.pe/ws/objects";
    private final IStudentService iStudentService;

    public StudentEndPoint(IStudentService iStudentService) {
        this.iStudentService = iStudentService;
    }

    @ResponsePayload
    public GetListStudentResponse obtenerStudents(@RequestPayload GetListStudentRequest request) {
        return iStudentService.obtenerStudents();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStudentRequest")
    @ResponsePayload
    public GetStudentResponse obtenerStudentPorId(@RequestPayload GetStudentRequest request) {
        return iStudentService.obtenerStudentPorId(request);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postStudentRequest")
    @ResponsePayload
    public PostStudentResponse guardarStudent(@RequestPayload PostStudentRequest request) {
        return iStudentService.guardarStudent(request);
    }
}