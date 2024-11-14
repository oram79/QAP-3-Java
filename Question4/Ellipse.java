package Question4;

public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double majorAxis, double minorAxis) {
        super(name);
        this.majorAxis = Math.max(majorAxis, minorAxis);
        this.minorAxis = Math.min(majorAxis, minorAxis);
    }

    @Override
    public double computePerimeter() {
        return Math.PI * (3 * (majorAxis + minorAxis) -
        Math.sqrt((3 * majorAxis + minorAxis) * (majorAxis + 3 * minorAxis)));
    }
    
    @Override
    public double computeArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public void scale(double factor) {
        this.majorAxis *= factor;
        this.minorAxis *= factor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major Axis: " + majorAxis
        + ", Minor Axis: " + minorAxis + ", Perimeter: " + computePerimeter()
        + ", Area: " + computeArea();
    }
}