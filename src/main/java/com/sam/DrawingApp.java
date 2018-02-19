package com.sam;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {
    public static void main(String[] args) {
        System.out.println("Inside Main");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"src/main/resources/spring.xml"});
        context.registerShutdownHook();// this destroys the context when it exits this main method - note previous line is changed to AbstractApplicationContext instead of ApplicationContext
        BeanFactory beanFactory = context;
        Triangle triangle = (Triangle) beanFactory.getBean("triangle1");
        triangle.draw();
        triangle = (Triangle) beanFactory.getBean("triangle1");
        triangle.draw();
    }
}
