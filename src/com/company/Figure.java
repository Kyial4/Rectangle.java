package com.company;

public abstract class Figure {
    public static String unit = "cm";
    private double perimetr;

    public double getPerimetr(int i, int i1) {
        return perimetr;
    }

    public void setPerimetr(double perimetr) {
        this.perimetr = perimetr;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimetr();
    public abstract String info();
}


