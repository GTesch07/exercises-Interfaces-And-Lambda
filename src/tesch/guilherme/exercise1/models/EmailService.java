package tesch.guilherme.exercise1.models;

public record EmailService() implements Message {

    @Override
    public void send(String text) {
        System.out.println("Enviando email: " + text);
    }
}
