package pe.edu.idat.ws.objects;

import jakarta.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public GetListCourseRequest createGetListCourseRequest() {
        return new GetListCourseRequest();
    }

    public GetListCourseResponse createGetListCourseResponse() {
        return new GetListCourseResponse();
    }

    public Coursesoap createCoursesoap() {
        return new Coursesoap();
    }

    public GetCourseRequest createGetCourseRequest() {
        return new GetCourseRequest();
    }

    public GetCourseResponse createGetCourseResponse() {
        return new GetCourseResponse();
    }

    public PostCourseRequest createPostCourseRequest() {
        return new PostCourseRequest();
    }

    public PostCourseResponse createPostCourseResponse() {
        return new PostCourseResponse();
    }

    public GetListStudentRequest createGetListStudentRequest() {
        return new GetListStudentRequest();
    }

    public GetListStudentResponse createGetListStudentResponse() {
        return new GetListStudentResponse();
    }

    public GetStudentRequest createGetStudentRequest() {
        return new GetStudentRequest();
    }

    public GetStudentResponse createGetStudentResponse() {
        return new GetStudentResponse();
    }

    public PostStudentRequest createPostStudentRequest() {
        return new PostStudentRequest();
    }

    public PostStudentResponse createPostStudentResponse() {
        return new PostStudentResponse();
    }

    public Studentsoap createStudentsoap() {
        return new Studentsoap();
    }
}