import java.util.Scanner;

public class Uri1073{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int N,Valor;

        N = teclado.nextInt();

        for (int cont = 2; cont <= N; cont+=2){
            Valor = cont*cont;
            System.out.println(cont + "^2 = " + Valor);

        }

    }
}