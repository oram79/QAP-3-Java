package Question3;

public class Ellipse extends Shape {
    private double a;
    private double b;

    public Ellipse(String name, double a, double b) {
        super(name);
        if (a < b) {
            double temp = a;
            a = b;
            b = temp;
        }
        this.a = a;
        this.b = b;
    }
    
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }
    
    @Override
    public double getPerimeter() {
        return Math.PI * 2 * (Math.sqrt((a * a * b * b) / 2.0));
    }
}
