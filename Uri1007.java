import java.util.Scanner;
public class Uri1007{
    public static void main(String.args[]){
        Scanner teclado = new Scanner(System.in);

        int A,B,C,D,AB,CD,DIFERENCA;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        AB = A * B;
        CD = C * D;

        DIFERENCA = AB - CD;

        //Saida
        System.out.println("DIFERENCA = " +DIFERENCA);

    }


}