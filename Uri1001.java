import java.util.Scanner;
public class Uri1001{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int A,B,X;

        A = teclado.nextInt();
        B = teclado.nextInt();
        X = A + B;
        
        //Saida
        System.out.println("X = " +X);

    }
}


