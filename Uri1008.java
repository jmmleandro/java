import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int funcional,horasTrabalhadas;
        float valorHora,salario;

        funcional = teclado.nextInt();
        horasTrabalhadas = teclado.nextInt();
        valorHora = teclado.nextFloat();

        salario = horasTrabalhadas * valorHora;

        //Saida

        System.out.println("NUMBER = " +funcional);
        System.out.printf("SALARY = U$ %.2f\n", salario);

    }

}