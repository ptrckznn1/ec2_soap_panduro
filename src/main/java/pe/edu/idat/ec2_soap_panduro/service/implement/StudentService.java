package pe.edu.idat.ec2_soap_panduro.service.implement;

import org.springframework.stereotype.Service;
import pe.edu.idat.ec2_soap_panduro.model.bd.Student;
import pe.edu.idat.ec2_soap_panduro.repository.StudentRepository;
import pe.edu.idat.ec2_soap_panduro.service.IStudentService;
import pe.edu.idat.ec2_soap_panduro.util.StudentConvert;
import pe.edu.idat.ws.objects.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {

    private final StudentRepository studentRepository;
    private final StudentConvert studentConvert;

    public StudentService(StudentRepository studentRepository, StudentConvert studentConvert) {
        this.studentRepository = studentRepository;
        this.studentConvert = studentConvert;
    }

    @Override
    public GetListStudentResponse obtenerStudents() {
        List<Student> studentList = studentRepository.findAll();
        List<Studentsoap> studentsoapList = new ArrayList<>();
        for (Student student : studentList) {
            studentsoapList.add(studentConvert.convertirStudentSoap(student));
        }
        GetListStudentResponse response = new GetListStudentResponse();
        response.getListstudents().addAll(studentsoapList);
        return response;
    }

    @Override
    public GetStudentResponse obtenerStudentPorId(GetStudentRequest request) {
        Optional<Student> student = studentRepository.findById(request.getId());
        GetStudentResponse response = new GetStudentResponse();
        if (student.isPresent()) {
            response.setStudent(studentConvert.convertirStudentSoap(student.get()));
        }
        return response;
    }

    @Override
    public PostStudentResponse guardarStudent(PostStudentRequest request) {
        Student student = new Student();
        if (request.getStudent().getId() != 0) {
            student = studentConvert.convertirStudentBD(request.getStudent());
        } else {
            student.setName(request.getStudent().getName());
            student.setDateOfBirth(studentConvert.convertStringToDate(request.getStudent().getDateOfBirth()));
            student.setEmail(request.getStudent().getEmail());
        }
        Student newStudent = studentRepository.save(student);
        PostStudentResponse response = new PostStudentResponse();
        response.setStudent(studentConvert.convertirStudentSoap(newStudent));
        return response;
    }
}