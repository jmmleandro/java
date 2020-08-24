import java.util.Scanner;

public class Uri1070{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int N;
        N = teclado.nextInt();

        if(N%2 ==0){
            N++;
        }
            for(int cont = 0; cont <= 5; cont++){
                System.out.println(N);
                N = N + 2;
            }

    }
}