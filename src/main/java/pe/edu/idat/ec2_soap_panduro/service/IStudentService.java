package pe.edu.idat.ec2_soap_panduro.service;

import pe.edu.idat.ws.objects.*;

public interface IStudentService {

    GetListStudentResponse obtenerStudents();

    GetStudentResponse obtenerStudentPorId(GetStudentRequest request);

    PostStudentResponse guardarStudent(PostStudentRequest request);
}