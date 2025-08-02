package tesch.guilherme.exercise1.models;

public record WhatsAppService() implements Message {

    @Override
    public void send(String text) {
        System.out.println("Enviando mensagem no WhatsApp: " + text);
    }

}
