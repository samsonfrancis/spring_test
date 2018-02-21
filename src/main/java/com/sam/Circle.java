package com.sam;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by sam on 21/2/18.
 */
public class Circle implements Shape {
    @Getter
    Point center;

    @Required
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println(center.getX());
    }
}
