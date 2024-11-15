package Question3;

public class Ellipse extends Shape {
    private double a;
    private double b;

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        if (axis1 > axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }
    
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }
    
    @Override
    public double getPerimeter() {
        return Math.PI * 2 * (a * a + b * b) - Math.pow((a - b), 2) / 2;
    }
}
