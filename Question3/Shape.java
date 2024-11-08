package Question3;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();
    public abstract double getPerimiter();

    @Override
    public String toString() {
        return "Shape: "+ name + ", Area: " +getArea() + ", Perimeter: " + getPerimiter();
    }
}

    
