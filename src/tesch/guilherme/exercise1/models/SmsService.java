package tesch.guilherme.exercise1.models;

public record SmsService() implements Message {

    @Override
    public void send(String text) {
        System.out.println("Enviando SMS: " + text);
    }
}
