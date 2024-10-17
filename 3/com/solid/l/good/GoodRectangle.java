package com.solid.l.good;

public class GoodRectangle implements Shape {

    private int width;

    private int height;

    public GoodRectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea()
    {
        return width * height;
    }

    public int getPerimeter()
    {
        return 2 * (width+height);
    }

}
