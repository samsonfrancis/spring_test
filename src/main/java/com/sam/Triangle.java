package com.sam;

import lombok.Getter;
import lombok.Setter;

public class Triangle {
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
}
