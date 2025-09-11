//Nicolle Lima Feitosa
import java.util.Scanner;
public class semana1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Digite o número
        System.out.print("Digite o número de 1 a 7: ");
        int numero = sc.nextInt();

        String dia;

        //Dias da semana

        switch(numero) {
            case 1:
            dia = "Domingo";
            break;
            case 2:
                dia = "Segunda";
            break;
            case 3:
                dia = "Terça-Feira";
            break;
            case 4:
                dia = "Quarta-Feira";
                break;
            case 5:
                dia = "Quinta-Feira";
                break;
            case 6:
                dia = "Sexta-Feira";

                break;
            case 7:
                dia = "Sábado";
            default:
                dia = "Item invalido! Digite de 1 a 7.";



        }

        //Saida

        System.out.println("Dia correspondente: " + dia );
    sc.close();


    }
}