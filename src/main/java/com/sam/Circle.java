package com.sam;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by sam on 21/2/18.
 */
public class Circle implements Shape {
    @Getter@Setter
    Point center;
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
