package tesch.guilherme.exercise2;

import java.util.Scanner;

import tesch.guilherme.exercise2.models.Aliment;
import tesch.guilherme.exercise2.models.Clothing;
import tesch.guilherme.exercise2.models.Culture;
import tesch.guilherme.exercise2.models.HealthPlan;
import tesch.guilherme.exercise2.models.Taxable;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("\n--- Menu de Cálculo de Tributos ---");
            System.out.println("1 - Produto Alimentício");
            System.out.println("2 - Saúde e Bem-estar");
            System.out.println("3 - Vestuário");
            System.out.println("4 - Cultura");
            System.out.println("5 - Sair do programa.\n");
            System.out.print("Escolha uma opção: ");

            try {
                option = scanner.nextInt();
                scanner.nextLine();

                if (option == 5) {
                    System.out.println("Saindo do programa...");
                    break;
                }

                if (option < 1 || option > 4) {
                    System.out.println("Opção inválida!");
                    continue;
                }

                System.out.println("Informe o nome do produto: ");
                String name = scanner.nextLine();
                System.out.println("Informe o preço do produto: R$ ");
                double price = scanner.nextDouble();
                scanner.nextLine();

                Taxable product = switch (option) {
                    case 1 -> new Aliment(name, price);
                    case 2 -> new HealthPlan(name, price);
                    case 3 -> new Clothing(name, price);
                    case 4 -> new Culture(name, price);
                    default -> throw new IllegalArgumentException("Opção inválida!");
                };
                System.out.printf("Produto: %s | Preço R$ %.2f | Imposto: R$ %.2f", name, price, product.getTax());
            } catch (Exception e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
