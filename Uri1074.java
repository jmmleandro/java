import java.util.Scanner;

public class Uri1074{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int N, valorLido = 0;

        N = teclado.nextInt();


        for (int cont = 0; cont <N; cont++){
            valorLido = teclado.nextInt();
            if (valorLido == 0){
                System.out.println("NULL");
            } else if (valorLido%2 == 0 && valorLido < 0){
                    System.out.println("EVEN NEGATIVE");
                }else if (valorLido%2 == 0 && valorLido > 0){
                    System.out.println("EVEN POSITIVE");
                }else if (valorLido%2 != 0 && valorLido < 0){
                    System.out.println("ODD NEGATIVE");
                }else{
                    System.out.println("ODD POSITIVE");
                }
            }

        }
        /*for (int cont=0; cont <N; cont++){
            valorLido = teclado.nextInt();
            if (valorLido == 0){
            } else if(valorLido%2 == 0){
                System.out.println("EVEN");
            } else{
                System.out.println("ODD");
            }
           
            if(valorLido == 0){
                System.out.println("NULL");
            } else if(valorLido < 0){
                System.out.println("NEGATIVE");
            } else{
                System.out.println("POSITIVE");
            }
       */
}