package Question2;

public class Demo {
    public static void main(String[] args) {
        // Create a Point object and print it
        Point point = new Point(1.5f, 2.5f);
        System.out.println();
        System.out.println("Initial Point: " + point);
        System.out.println();

        // Create a MovablePoint object and print it
        MovablePoint movablePoint = new MovablePoint(1.0f, 1.0f,  0.5f,  0.5f);
        System.out.println("Initial MovablePoint: " + movablePoint);
        System.out.println();
        
        // Move the MovablePoint and print the result
        movablePoint.move();
        System.out.println("After moving: " + movablePoint);
        System.out.println();
        }
    }
    

