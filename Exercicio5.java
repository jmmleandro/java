import java.util.Scanner;
public class Exercicio5{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float velocidadeMedia;
        float tempoGasto;
        float distancia;
        float litrosUtilizados;

        System.out.println("Digite a velocidade media");
        velocidadeMedia = teclado.nextInt();
        System.out.println("Digite o tempo gasto na viagem em decimal");
        tempoGasto = teclado.nextFloat();

        distancia = velocidadeMedia * tempoGasto;
        litrosUtilizados = distancia / 12;

        //Saída 
        System.out.println("a quantidade de litros gastos foi " + litrosUtilizados);
    }
}