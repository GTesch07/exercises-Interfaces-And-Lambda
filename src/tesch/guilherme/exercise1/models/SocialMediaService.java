package tesch.guilherme.exercise1.models;

public record SocialMediaService() implements Message {

    @Override
    public void send(String text) {
        System.out.println("Postando no Twitter: " + text);
    }
}
