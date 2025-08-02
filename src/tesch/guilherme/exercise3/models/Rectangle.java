package tesch.guilherme.exercise3.models;

public record Rectangle(double height, double base) implements GeometricForm {

    @Override
    public double getArea() {
        return height * base;
    }
}
