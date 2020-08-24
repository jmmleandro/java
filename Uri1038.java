import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codigo,quantidade;
        float preco, vfinal;

        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();

        if (codigo == 1){
            preco = 4.0f;
        }
        else if (codigo == 2){
            preco = 4.5f;
        }
        else if (codigo == 3){
            preco = 5.0f;          
        }
        else if (codigo == 4){
            preco = 2.0f;
        }
        else{
            preco = 1.5f;
        }

        vfinal = preco * quantidade;

        System.out.printf("Total: R$ %.2f\n", vfinal);


    }




}

