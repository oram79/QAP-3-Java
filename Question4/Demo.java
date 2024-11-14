package Question4;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle1", 5);
        Ellipse ellipse = new Ellipse("Ellipse1", 7, 3);

        System.out.println("Before scaling:");
        System.out.println(circle);
        System.out.println(ellipse);

        // Scale shapes
        circle.scale(2);
        ellipse.scale(1.5);

        System.out.println("\nAfter scaling:");
        System.out.println(circle);
        System.out.println(ellipse);
    }
}
