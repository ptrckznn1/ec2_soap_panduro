package pe.edu.idat.ec2_soap_panduro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class CourseWsdlConfig {

    @Bean(name = "courses")
    public DefaultWsdl11Definition courseWsdl(XsdSchema courseSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CoursesPort");
        wsdl11Definition.setLocationUri("/ws/courses");
        wsdl11Definition.setSchema(courseSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema courseSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/course.xsd"));
    }
}