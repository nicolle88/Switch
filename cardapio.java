//Nicolle Lima Feitosa
import java.util.Scanner;
public class Lanchonete {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            // o cardápio
            System.out.println("===== Cardápio =====");
            System.out.println("100 - Cachorro Quente - R$ 1,20");
            System.out.println("101 - Bauru Simples   - R$ 1,30");
            System.out.println("102 - Bauru com Ovo   - R$ 1,50");
            System.out.println("103 - Hambúrguer      - R$ 1,20");
            System.out.println("=====================");

            // Inserir dados
            System.out.print("Digite o código do produto: ");
            int codigo = in.nextInt();

            System.out.print("Digite a quantidade desejada: ");
            int quantidade = in.nextInt();

            double total = 0;
            String produto = "";


            switch (codigo) {
                case 100:
                    produto = "Cachorro Quente";
                    total = 1.20 * quantidade;
                    break;
                case 101:
                    produto = "Bauru Simples";
                    total = 1.30 * quantidade;
                    break;

            }
