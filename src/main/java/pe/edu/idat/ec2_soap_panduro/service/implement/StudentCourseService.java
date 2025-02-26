package pe.edu.idat.ec2_soap_panduro.service.implement;

import org.springframework.stereotype.Service;
import pe.edu.idat.ec2_soap_panduro.model.bd.StudentCourse;
import pe.edu.idat.ec2_soap_panduro.repository.StudentCourseRepository;
import pe.edu.idat.ec2_soap_panduro.service.IStudentCourseService;
import pe.edu.idat.ec2_soap_panduro.util.StudentCourseConvert;
import pe.edu.idat.ws.objects.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentCourseService implements IStudentCourseService {

    private final StudentCourseRepository studentCourseRepository;
    private final StudentCourseConvert studentCourseConvert;

    public StudentCourseService(StudentCourseRepository studentCourseRepository, StudentCourseConvert studentCourseConvert) {
        this.studentCourseRepository = studentCourseRepository;
        this.studentCourseConvert = studentCourseConvert;
    }

    @Override
    public GetListStudentCourseResponse obtenerStudentCourses() {
        List<StudentCourse> studentCourseList = studentCourseRepository.findAll();
        List<StudentCoursesoap> studentCourseSoapList = new ArrayList<>();
        for (StudentCourse studentCourse : studentCourseList) {
            studentCourseSoapList.add(studentCourseConvert.convertirStudentCourseSoap(studentCourse));
        }
        GetListStudentCourseResponse response = new GetListStudentCourseResponse();
        response.getListStudentCourses().addAll(studentCourseSoapList);
        return response;
    }

    @Override
    public GetStudentCourseResponse obtenerStudentCoursePorId(GetStudentCourseRequest request) {
        Optional<StudentCourse> studentCourse = studentCourseRepository.findById(request.getId());
        GetStudentCourseResponse response = new GetStudentCourseResponse();
        studentCourse.ifPresent(value -> response.setStudentCourse(studentCourseConvert.convertirStudentCourseSoap(value)));
        return response;
    }

    @Override
    public PostStudentCourseResponse guardarStudentCourse(PostStudentCourseRequest request) {
        StudentCourse studentCourse = studentCourseConvert.convertirStudentCourseBD(request.getStudentCourse());
        StudentCourse newStudentCourse = studentCourseRepository.save(studentCourse);
        PostStudentCourseResponse response = new PostStudentCourseResponse();
        response.setStudentCourse(studentCourseConvert.convertirStudentCourseSoap(newStudentCourse));
        return response;
    }
}