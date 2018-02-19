package com.sam;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp
{
    public static void main( String[] args )
    {
        System.out.println( "Inside Main" );
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"src/main/resources/spring.xml"});
        BeanFactory beanFactory = context;
        Triangle triangle = (Triangle) beanFactory.getBean("triangle1");
        triangle.draw();
        triangle = (Triangle) beanFactory.getBean("triangle1");
        triangle.draw();
    }
}
