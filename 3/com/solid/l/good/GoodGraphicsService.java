package com.solid.l.good;

import com.solid.l.bad.BadRectangle;

public class GoodGraphicsService {
    public void checkForArea(Shape shape) {
        System.out.println("The area of this shape is" + shape.getArea());
    }


    public void checkForPerimeter(Shape shape) {
        System.out.println("The perimeter of this shape is" + shape.getPerimeter());
    }

}
