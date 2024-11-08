package Question2;

public class Point {
    private float x;
    private float y;
    
    // Constructor //
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0.0f, 0.0f);
    }

    // Getter Methods //
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    
    // Setter Methods //
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // toString Method //
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}