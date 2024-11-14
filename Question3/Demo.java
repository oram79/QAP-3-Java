package Question3;

public class Demo {
    public static void main(String[] args) {
        // Create instances of shapes
        Shape circle = new Circle(5.0);
        Shape ellipse = new Ellipse(4.0, 2.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0);
        Shape equilateralTriangle = new EquilateralTriangle(6.0);

        // Store shapes in an array
        Shape[] shapes = {circle, ellipse, triangle, equilateralTriangle};

        // Loop through the array and print each shape's details
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}

