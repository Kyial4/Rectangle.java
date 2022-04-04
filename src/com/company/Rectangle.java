package com.company;

public class Rectangle extends Figure{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        super.setPerimetr(calculatePerimetr());
    }

    @Override
    public double calculateArea() {
        double areaRectangle;
        areaRectangle= length*width;
        return areaRectangle;
    }

    @Override
    public double calculatePerimetr() {
        int perimeterRectangle;
        perimeterRectangle = (length + width) *2;
        return perimeterRectangle;
    }


    @Override
    public String info() {
        return  "\nlength: " + length + Figure.unit +
                "\nwidth: " + width + Figure.unit +
                "\nperimeter: " + getPerimetr(3,5) + Figure.unit +
                "\narea: " + calculateArea() + Figure.unit ;
    }
}
