import java.util.Scanner;
public class Uri1003{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int A,B,SOMA;

        A = teclado.nextInt();
        B = teclado.nextInt();

        SOMA = A + B;
        
        //Saida
        System.out.println("SOMA = " +SOMA);
    }
}