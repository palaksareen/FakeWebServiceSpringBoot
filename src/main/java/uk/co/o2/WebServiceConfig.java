package uk.co.o2;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import javax.xml.ws.Endpoint;
//import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
//import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import uk.co.o2.soa.subscriberservice_2.SubscriberPortImpl;


@Configuration
public class WebServiceConfig {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
    	System.out.println("End point is registering....");
        EndpointImpl endpoint = new EndpointImpl(bus, new SubscriberPortImpl());
        endpoint.publish("/Subscriber_2_0");
        //System.out.println("End point is registering...."+endpoint.getServer().getEndpoint());
        return endpoint;
    }

/*@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter
{
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext)
    {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        //servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/service/*");
    }
 
    @Bean(name = "subscriberProfile")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema countriesSchema)
    {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("SubscriberPort");
        //wsdl11Definition.setLocationUri("/service/student-details");
        wsdl11Definition.setTargetNamespace("http://soa.o2.co.uk/subscriberservice_2");
        //wsdl11Definition.setSchema(countriesSchema);
        return wsdl11Definition;
    }
    @Bean(name = "subscriberProfile")
    public Wsdl11Definition defaultWsdl11Definition() {
      SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
      wsdl11Definition.setWsdl(new ClassPathResource("resources/subscriberservice_2_0.wsdl"));

      return wsdl11Definition;
    }
   */
}