package pe.edu.idat.ec2_soap_panduro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class StudentCourseWsdlConfig {

    @Bean(name = "studentCourses")
    public DefaultWsdl11Definition studentCourseWsdl(XsdSchema studentCourseSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("StudentCoursesPort");
        wsdl11Definition.setTargetNamespace("http://www.idat.edu.pe/ws/objects");
        wsdl11Definition.setSchema(studentCourseSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema studentCourseSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/studentCourse.xsd"));
    }
}