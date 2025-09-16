//Nicolle Lima Feitosa
import java.util.Scanner;

public class plano4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inserir valores
        System.out.print("Digite o plano (A, B ou C): ");
        char plano = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite o salário atual: ");
        double salario = scanner.nextDouble();

        double newpayment;

        switch (plano) {
            case 'A':
                newpayment = salario * 1.10;
                break;
            case 'B':
                newpayment = salario * 1.15;
                break;
            case 'C':
                newpayment = salario * 1.20;
                break;
            default:
                System.out.println("Plano inválido.");
                scanner.close();
                return;
        }

        System.out.printf("O novo salário é: R$ %.2f%n", newpayment);
        scanner.close();
    }
}

