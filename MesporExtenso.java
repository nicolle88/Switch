import java.util.Scanner;
 class MesporExtenso {
     public static void  main (String[] args) {
         Scanner sc = new Scanner(System.in);
         //Digite o número
         System.out.print("Digite um número de 1 a 12: ");
         int numero = sc.nextInt();

         String mes;

         //mes por extenso

         switch (numero){
             case 1:
             mes = "Janeiro";
             break;
             case 2:
             mes = "Fevereiro";
             break;
             case 3:
             mes = "Março";
             break;
             case 4:
             mes = "Abril";
             break;
             case 5:
             mes = "Maio";
             break;
             case 6:
             mes = "Junho";
             break;
             case 7:
             mes = "Julho";
             break;
             case 8:
             mes = "Agosto";
             break;
             case 9:
             mes = "Setembro";
             break;
             case 10:
             mes = "Outubro";
             break;
             case 11:
             mes = "Novembro";
             break;
             case 12:
             mes = "Dezembro";

             default:
                 mes = "Item invalido digite de 1 a 12.";


         }

         System.out.println("Mes correspodentende: " + mes);

     }

}

