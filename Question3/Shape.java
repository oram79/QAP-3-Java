package Question3;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double computePerimeter();
    public abstract double computeArea();

    @Override
    public String toString() {
        return "Shape: " + name;
    }
}

