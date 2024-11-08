package Question3;

public class Circle extends Ellipse{
    private double radius;

    public Circle(String name, double radius) {
        super(name, radius, radius);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
