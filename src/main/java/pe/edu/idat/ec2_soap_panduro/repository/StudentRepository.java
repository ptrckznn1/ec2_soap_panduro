package pe.edu.idat.ec2_soap_panduro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.idat.ec2_soap_panduro.model.bd.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}