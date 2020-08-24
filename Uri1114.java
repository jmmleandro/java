import java.util.Scanner;

public class Uri1114{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);

        int senha, entrada;

        entrada = teclado.nextInt();

        while (entrada != 2002){
            System.out.println("Senha Invalida");
            entrada = teclado.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
