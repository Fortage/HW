package com.company;

public class Square extends Rectangle implements Moveable{

    @Override
    int getPerimeter() {
        return this.x * 2 + this.y * 2;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
