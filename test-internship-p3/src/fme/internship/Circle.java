package fme.internship;

public class Circle implements Shape{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
       return (radius*radius) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return (radius * 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
