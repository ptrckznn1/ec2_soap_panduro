package pe.edu.idat.ec2_soap_panduro.service.implement;

import org.springframework.stereotype.Service;
import pe.edu.idat.ec2_soap_panduro.model.bd.Course;
import pe.edu.idat.ec2_soap_panduro.repository.CourseRepository;
import pe.edu.idat.ec2_soap_panduro.service.ICourseService;
import pe.edu.idat.ec2_soap_panduro.util.CourseConvert;
import pe.edu.idat.ws.objects.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements ICourseService {

    private final CourseRepository courseRepository;
    private final CourseConvert courseConvert;

    public CourseService(CourseRepository courseRepository, CourseConvert courseConvert) {
        this.courseRepository = courseRepository;
        this.courseConvert = courseConvert;
    }

    @Override
    public GetListCourseResponse obtenerCourses() {
        List<Course> courseList = courseRepository.findAll();
        List<Coursesoap> coursesoapList = new ArrayList<>();
        for (Course course : courseList) {
            coursesoapList.add(courseConvert.convertirCursoSoap(course));
        }
        GetListCourseResponse response = new GetListCourseResponse();
        response.getListcourses().addAll(coursesoapList);
        return response;
    }

    @Override
    public GetCourseResponse obtenerCoursePorId(GetCourseRequest request) {
        Optional<Course> course = courseRepository.findById(request.getId());
        GetCourseResponse response = new GetCourseResponse();
        if (course.isPresent()) {
            response.setCourse(courseConvert.convertirCursoSoap(course.get()));
        }
        return response;
    }

    @Override
    public PostCourseResponse guardarCourse(PostCourseRequest request) {
        Course course = new Course();
        if (request.getCourse().getIdcurso() != 0) {
            course = courseConvert.convertirCursoBD(request.getCourse());
        } else {
            course.setName(request.getCourse().getNomcurso());
            course.setCredit(request.getCourse().getCredito());
            course.setDescription(request.getCourse().getDescription());
        }
        Course newCourse = courseRepository.save(course);
        PostCourseResponse response = new PostCourseResponse();
        response.setCourse(courseConvert.convertirCursoSoap(newCourse));
        return response;
    }
}