import java.util.Scanner;

public class Uri1065{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int N,QTD=0;

        for (int contador=0; contador<=4; contador++){
            N = teclado.nextInt();

            if (N%2 == 0){
                QTD++;
            }
        }
        System.out.println(QTD + " valores pares");


    }


} 