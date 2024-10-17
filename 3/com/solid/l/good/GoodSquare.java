package com.solid.l.good;

public class GoodSquare implements Shape {
    private int length;
    public GoodSquare(int length) {
        super();
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getArea()
    {
        return length * length;
    }

    public int getPerimeter()
    {
        return 4 * length;
    }

}
