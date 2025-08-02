package tesch.guilherme.exercise3.models;

public record Square(double side) implements GeometricForm {

    @Override
    public double getArea() {
        return side * side;
    }

}
