package fme.internship;

public class Square implements Shape{

    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
