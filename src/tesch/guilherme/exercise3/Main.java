package tesch.guilherme.exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;

import tesch.guilherme.exercise3.models.Circle;
import tesch.guilherme.exercise3.models.GeometricForm;
import tesch.guilherme.exercise3.models.Rectangle;
import tesch.guilherme.exercise3.models.Square;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        GeometricForm geometricForm = null;
        while (true) {
            System.out.println("Escolha a forma geométrica para calcular a área: ");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.println("4 - Sair do programa\n");

            try {
                option = scanner.nextInt();
                scanner.nextLine();
                if (option == 1) {
                    geometricForm = createSquare();
                } else if (option == 2) {
                    geometricForm = crateRectangle();
                } else if (option == 3) {
                    geometricForm = createCircle();
                } else if (option == 4) {
                    break;
                } else {
                    System.out.println("Opção inválida!\n");
                    continue;
                }
                System.out.println("O resultado do cálculo da área foi de: " + geometricForm.getArea() + "\n");
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteirno. \n");
                scanner.nextLine();
            }

        }
    }

    private static GeometricForm createSquare() {
        System.out.println("Informe os tamanhos dos lados: ");
        var side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm crateRectangle() {
        System.out.println("Informe a altura: ");
        var height = scanner.nextDouble();
        System.out.println("Informe a base: ");
        var base = scanner.nextDouble();
        return new Rectangle(height, base);
    }

    private static GeometricForm createCircle() {
        System.out.println("Informe o raio: ");
        var radius = scanner.nextDouble();
        return new Circle(radius);
    }
}
