package com.sam;

import lombok.Getter;
import lombok.Setter;
//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;

public class Triangle implements Shape/*, InitializingBean, DisposableBean*/{
    @Getter@Setter
    private Point a;
    @Getter@Setter
    private Point b;
    @Getter@Setter
    private Point c;
    public void draw() {
        System.out.println(getA().getX() + "," + getA().getY() );
        System.out.println(getB().getX() + "," + getB().getY() );
        System.out.println(getC().getX() + "," + getC().getY() );
    }

    /*
     * this method is called when creating the bean after initializing the variables
     */
/*
    @Override
    public void afterPropertiesSet() throws Exception {
        // i can write the piece of code that need to be executed after initiazing the here.
        System.out.println("Inside Initializing method of Triangle bean");
    }
*/

    /*
     * this method is called just before the bean is destroyed
     */
/*    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destory method of Traiangle bean.");
    }*/

    /*
     * the following is th default-init-method which is set at the <beans > tag
     */
    public void init(){
        System.out.println("Default init(): " + getA().getX() + "," + getA().getY());
    }

    /*
     * the following is th default-destroy-method which is set at the <beans > tag
     */
    public void destroy(){
        System.out.println("Default destroy()");
    }

}
