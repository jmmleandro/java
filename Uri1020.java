import java.util.Scanner;
public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int idadeEmDias,anos,resto,meses,dias;
        
        idadeEmDias = teclado.nextInt();

        anos = idadeEmDias / 365;
        resto = idadeEmDias % 365;
        meses = resto / 30;
        dias = resto % 30;
        
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");


     }


}