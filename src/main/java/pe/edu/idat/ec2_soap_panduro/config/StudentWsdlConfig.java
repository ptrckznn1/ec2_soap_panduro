package pe.edu.idat.ec2_soap_panduro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class StudentWsdlConfig {

    @Bean(name = "students")
    public DefaultWsdl11Definition studentWsdl(XsdSchema studentSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("StudentsPort");
        wsdl11Definition.setLocationUri("/ws/students");
        wsdl11Definition.setSchema(studentSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema studentSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/student.xsd"));
    }
}