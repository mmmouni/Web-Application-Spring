package com.sathya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Mouni")
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
        CustomerBean d1=(CustomerBean)ctx.getBean("id1");
        EmployeeBean e1 =(EmployeeBean)ctx.getBean("id2");
        EmployeeBean e2 =(EmployeeBean)ctx.getBean("id2");
    }
}
