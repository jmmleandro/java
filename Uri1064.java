import java.util.Scanner;

public class Uri1064{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int somapositivo = 0;
        float numero,soma = 0,media = 0,somavalores = 0;

        for(int contador =1; contador <=6; contador++){
            numero = teclado.nextFloat();

            
            if (numero>0){
            somapositivo++;
            somavalores = somavalores + numero;            
            }    
        }
        media = somavalores/somapositivo;

        System.out.println(somapositivo + " valores positivos");
        System.out.printf("%.1f\n", media);

    }
}