import java.util.Scanner;

public class Uri1067{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int N;
        N = teclado.nextInt();

        for (int cont = 1; cont <= N; cont++){
            if(cont%2 != 0){
            System.out.println(cont);
            }
        }

    }
}