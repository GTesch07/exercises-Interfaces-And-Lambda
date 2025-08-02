package tesch.guilherme.exercise3.models;

public record Circle(double radius) implements GeometricForm {
    private static final double pi = 3.1415;

    @Override
    public double getArea() {
        return pi * Math.pow(radius, 2);
    }
}
