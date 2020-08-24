import java.util.Scanner;

public class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float X,Y,Q1,Q2,Q3,Q4;
        int quadrante;

        X = teclado.nextFloat();
        Y = teclado.nextFloat();

        if (X == 0 && Y == 0){
            System.out.println("Origem");
        }
        else if(X == 0 && Y != 0){
            System.out.println("Eixo Y");
        }
        else if (X != 0 && Y == 0){
            System.out.println("Eixo X");
        }
        else if (X > 0 && Y > 0){
            System.out.println("Q1");
        }
        else if (X > 0 && Y < 0){
            System.out.println("Q4");
        }
        else if (X < 0 && Y < 0){
            System.out.println("Q3");
        }
        else{
            System.out.println("Q2");
        }
    }


}

