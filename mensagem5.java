//Nicolle Lims Feitosa
import java.util.Locale;
import java.util.Scanner;

public class mensagem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Inserir os números
        System.out.print("Digite o primeiro número: ");
        double num1 = in.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = in.nextDouble();

        // Menu de opções
        System.out.println("Escolha a operação:");
        System.out.println("M - Média entre os números");
        System.out.println("S - Diferença do maior pelo menor");
        System.out.println("P - Produto entre os números");
        System.out.println("D - Divisão do primeiro pelo segundo");


        char opcao = in.next().toUpperCase().charAt(0);

        double resultado;

        switch (opcao) {
            case 'M':
                resultado = (num1 + num2) / 2;
                System.out.println("Média = " + resultado);
                break;

            case 'S':
                resultado = Math.abs(num1 - num2);
                System.out.println("Diferença = " + resultado);
                break;

            case 'P':
                resultado = num1 * num2;
                System.out.println("Produto = " + resultado);
                break;

            case 'D':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Divisão = " + resultado);
                } else {
                    System.out.println("Erro");
                }
                break;

            default:
                System.out.println("Opção inválida.");
        }

        in.close();
    }
}
