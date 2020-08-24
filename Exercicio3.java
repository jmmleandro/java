import java.util.Scanner;
public class Exercicio3{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float a;
        float b;
        float valorKw;
        float valorAPagar;
        float valorComDesconto;
        
        System.out.println("Digite o valor do salário minimo");
        a = teclado.nextFloat();
        System.out.println("Quantos kw foram gastos?");
        b = teclado.nextInt();

        valorKw = ((a/7)/100);
        valorAPagar = valorKw * b;
        valorComDesconto = valorAPagar * 90/100;

        //Saida
        System.out.println("o valor em reais de cada kw é " + valorKw);
        System.out.println("o valor em reais a ser pago " + valorAPagar);
        System.out.println("o novo valor a ser pago por essa residência com um desconto de 10% é " + valorComDesconto);

    }
}
 