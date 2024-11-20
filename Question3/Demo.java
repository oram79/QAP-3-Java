package Question3;

public class Demo {
    public static void main(String[] args) {
        // Circle
        System.out.println();
        Circle circle = new Circle("Circle", 5);
        System.out.println(circle);

        // Ellipse
        Ellipse ellipse = new Ellipse("Ellipse", 7, 4);
        System.out.println(ellipse);

        // Triangle
        Triangle triangle = new Triangle("Triangle", 3, 4, 5);
        System.out.println(triangle);

        // Equilateral Triangle
        EquilateralTriangle equilateral = new EquilateralTriangle("Equilateral", 6);
        System.out.println(equilateral);
        System.out.println();

        // Store all shapes in an array and print them
        Shape[] shapes = {circle, ellipse, triangle, equilateral};
        System.out.println("Shapes in Array:");
        System.out.println();

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println();
    }
}

