package com.example.pkg;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Point {
    private int x;
    private int y;

    public Point(double d, float f1, float f2) {
        System.out.println(d+", " + f1 + ", " + f2);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
