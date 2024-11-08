package Question2;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    // Constructor //
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    // Default Constructor //
    public MovablePoint() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    // Getter Methods //
    public float getXSpeed() {
        return xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }

    // Setter Methods //
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter Methods //
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Move method to update x and y positions //
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
    
    // To string method //
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}

