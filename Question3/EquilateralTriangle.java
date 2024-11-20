package Question3;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(String name, double sideLength) {
        super(name, sideLength, sideLength, sideLength);
    }

    @Override
    public String toString() {
        return super.toString() + " (Equilateral)";
    }
}

