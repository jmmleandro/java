import java.util.Scanner;

public class Uri2780{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int D,pontuacao;

        D = teclado.nextInt();

        if (D <= 800){
            pontuacao = 1;
            System.out.println(pontuacao);
        }
        else if (800 < D && D <= 1400){
            pontuacao = 2;
            System.out.println(pontuacao);
        }
        else if ( 1400 < D && D <= 2000){
            pontuacao = 3;
            System.out.println(pontuacao);
        }




        



    }


}