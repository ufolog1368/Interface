package by.jis4.komarov.bean;

public class Triangle extends AbstractShape {

    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double areaTr(){
        return (side * height) / 2;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        return areaTr();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                " area = " + getArea() +
                '}';
    }
}
