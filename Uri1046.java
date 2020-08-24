import java.util.Scanner;

public class Uri1046{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int inicio,fim,ttotal;

        inicio = teclado.nextInt();
        fim = teclado.nextInt();

        if (inicio > fim){
            ttotal = ((inicio - 24)*-1) + fim;
            System.out.println("O JOGO DUROU " + ttotal + " HORA(S)");
        }
        else if (inicio < fim){
            ttotal = (inicio - fim) * -1;
            System.out.println("O JOGO DUROU " + ttotal + " HORA(S)");
        }
        else{
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }




    }



}