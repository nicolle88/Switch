//Nicolle Lima Feitosa
import java.sql.SQLOutput;
import java.util.Scanner;
public class periodo3 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        //Insira o período
        System.out.println("Digite seu período (M - Matutino; V - Vespertino; N - Noturno.): ");

        //Saudaçāo
        String turno = e.nextLine();

        switch (turno.toLowerCase()) {
        case "m":
        System.out.println("Bom dia!");
        break;
        case "v":
        System.out.println("Boa tarde!");
        break;
        case "n":
        System.out.println("Boa noite!");
        break;

        default:
        System.out.println("Período invalido");

        }




    }
}