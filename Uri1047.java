import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hInicio,mInicio,hFim,mFim,hResultado,mResultado;

        hInicio = teclado.nextInt() * 60;
        mInicio = teclado.nextInt();
        hFim = teclado.nextInt() * 60;
        mFim = teclado.nextInt();
        hInicio = hInicio + mInicio;
        hFim = hFim + mFim;

        if (hInicio >= hFim){
            hResultado = ((24*60) + hFim - hInicio)/60;
            mResultado = ((24*60) + hFim - hInicio)%60;
            System.out.println("O JOGO DUROU " +hResultado+ " HORA(S) E " +mResultado+ " MINUTO(S)");
        }
        else if (hInicio < hFim){
            hResultado = (hFim - hInicio)/60;
            mResultado = (hFim - hInicio)%60;
            System.out.println("O JOGO DUROU " +hResultado+ " HORA(S) E " +mResultado+ " MINUTO(S)");
        }
        
    }


}