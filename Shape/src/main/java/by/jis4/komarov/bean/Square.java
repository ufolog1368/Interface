package by.jis4.komarov.bean;

public class Square extends AbstractShape {

    private double squareLength;

    public Square(double squareLength) {
        this.squareLength = squareLength;
    }

    public double areaSq(){
        return squareLength * squareLength;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return areaSq();
    }

    @Override
    public String toString() {
        return "Square{" +
                " area = " + getArea() +
                '}';
    }
}
