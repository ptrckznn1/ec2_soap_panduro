package pe.edu.idat.ec2_soap_panduro.util;

import org.springframework.stereotype.Component;
import pe.edu.idat.ec2_soap_panduro.model.bd.Student;
import pe.edu.idat.ws.objects.Studentsoap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class StudentConvert {

    private static final String DATE_FORMAT = "yyyy-MM-dd";

    public Student convertirStudentBD(Studentsoap studentsoap) {
        Student student = new Student();
        student.setId(studentsoap.getId());
        student.setName(studentsoap.getName());
        student.setDateOfBirth(convertStringToDate(studentsoap.getDateOfBirth()));
        student.setEmail(studentsoap.getEmail());
        return student;
    }

    public Studentsoap convertirStudentSoap(Student student) {
        Studentsoap studentsoap = new Studentsoap();
        studentsoap.setId(student.getId());
        studentsoap.setName(student.getName());
        studentsoap.setDateOfBirth(convertDateToString(student.getDateOfBirth()));
        studentsoap.setEmail(student.getEmail());
        return studentsoap;
    }

    public Date convertStringToDate(String dateString) {
        try {
            return new SimpleDateFormat(DATE_FORMAT).parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException("Error parsing date: " + dateString, e);
        }
    }

    private String convertDateToString(Date date) {
        return new SimpleDateFormat(DATE_FORMAT).format(date);
    }
}