package by.jis4.komarov.bean;

public class Circle extends AbstractShape{

    private double radius;



    public Circle(double radius) {
        this.radius = radius;
    }

    public double areaCi(){
        return  Math.PI * radius *radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return areaCi();
    }

    @Override
    public String toString() {
        return "Circle{" +
                " area = " + getArea() +
                '}';
    }
}
