package com.example.pkg;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Point {
    private int x;
    private int y;

    public Point(double d, float f) {
        System.out.println(d+", " + f);
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
