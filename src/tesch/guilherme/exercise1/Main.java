package tesch.guilherme.exercise1;

import java.util.Scanner;

import tesch.guilherme.exercise1.models.EmailService;
import tesch.guilherme.exercise1.models.SmsService;
import tesch.guilherme.exercise1.models.SocialMediaService;
import tesch.guilherme.exercise1.models.WhatsAppService;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String mensagem = "Olá mundo";
        SmsService smsService = new SmsService();
        EmailService emailService = new EmailService();
        SocialMediaService socialMediaService = new SocialMediaService();
        WhatsAppService whatsAppService = new WhatsAppService();

        while (true) {
            System.out.println("\nEscolha o serviço de envio: ");
            System.out.println("1 - SMS");
            System.out.println("2 - Email");
            System.out.println("3 - Twitter");
            System.out.println("4 - WhatsApp");
            System.out.println("5 - Sair do programa\n");

            try {
                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1 -> smsService.send(mensagem);
                    case 2 -> emailService.send(mensagem);
                    case 3 -> socialMediaService.send(mensagem);
                    case 4 -> whatsAppService.send(mensagem);
                    case 5 -> {
                        System.out.println("Saindo do programa...");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Opção inválida!\n");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro. \n");
                scanner.nextLine();
            }
        }
    }
}
