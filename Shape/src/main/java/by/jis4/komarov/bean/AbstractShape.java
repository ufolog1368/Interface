package by.jis4.komarov.bean;

import by.jis4.komarov.interfaces.Shape;

public abstract class AbstractShape implements Shape {
    private String name;
    private double area;
    private int angle;

    public AbstractShape() {
    }

    public AbstractShape(String name, double area, int angle) {
        this.name = name;
        this.area = area;
        this.angle = angle;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "AbstractShape{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", angle=" + angle +
                '}';
    }
}
