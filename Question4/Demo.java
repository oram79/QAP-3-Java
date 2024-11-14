package Question4;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle1", 5);
        Ellipse ellipse = new Ellipse("Ellipse1", 7, 3);
        Triangle triangle = new Triangle("Triangle1", 3, 4, 5);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("Equilateral1", 5);
        
        // listing all shape before scaling //

        System.out.println("Before scaling:");
        System.out.println(circle);
        System.out.println(ellipse);
        System.out.println(triangle);
        System.out.println(equilateralTriangle);

        // Scale shapes //

        circle.scale(2);
        ellipse.scale(1.5);
        triangle.scale(2);
        equilateralTriangle.scale(1.5);

        System.out.println("\nAfter scaling:");
        System.out.println(circle);
        System.out.println(ellipse);
        System.out.println(triangle);
        System.out.println(equilateralTriangle);
    }
}
