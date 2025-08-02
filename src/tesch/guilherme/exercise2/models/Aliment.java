package tesch.guilherme.exercise2.models;

public record Aliment(String name, double price) implements Taxable {
    @Override
    public double getTax() {
        return price * 0.01;
    }

}
