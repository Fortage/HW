package com.company;

public class Circle extends Ellipse implements Moveable{

    @Override
    int getPerimeter() {
        return 10;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
