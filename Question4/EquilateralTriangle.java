package Question4;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(String name, double sideLength) {
        super(name, sideLength, sideLength, sideLength);
    }

    @Override
    public void scale(double factor) {
        super.scale(factor); // getting the scaling from the triangle class //
    }

    @Override
    public String toString() {
        return super.toString() + " (Equilateral)";
    }
}
