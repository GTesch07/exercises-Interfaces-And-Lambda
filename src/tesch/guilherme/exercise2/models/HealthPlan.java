package tesch.guilherme.exercise2.models;

public record HealthPlan(String name, double price) implements Taxable {

    @Override
    public double getTax() {
        return price * 0.015;
    }

}
