package com.company;

public class Square extends Figure{
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
        this.setPerimetr(calculatePerimetr());
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public double calculatePerimetr() {
        return sideLength * 4;
    }

    @Override
    public String info() {
        return "\nsideLength: " + sideLength + Figure.unit +
                "\nperimeter: " + getPerimetr(2,5) + Figure.unit +
                "\narea: " + calculateArea() + Figure.unit ;
    }
}
