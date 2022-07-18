package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Figure[] arrayFigure = new Figure[4];
        arrayFigure[0] = new Rectangle();
        arrayFigure[1] = new Ellipse();
        arrayFigure[2] = new Square();
        arrayFigure[3] = new Circle();
        for (Figure figure : arrayFigure)
        {
            if (figure instanceof Moveable)
            {
                ((Moveable) figure).move(new Random().nextInt(10), new Random().nextInt(10));
                System.out.println("x = " +figure.x+ " y = " +figure.y);
            }
            System.out.println(figure.getPerimeter());
        }
    }
}
