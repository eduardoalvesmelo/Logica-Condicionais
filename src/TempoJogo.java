import java.util.Locale;
import java.util.Scanner;

public class TempoJogo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int hInicio = sc.nextInt();

        System.out.print("Hora final: ");
        int hFinal = sc.nextInt();

        if (hInicio > hFinal) {
            int totalHoras = (hFinal + 24) - hInicio;
            System.out.printf("O JOGO DUROU %d HORA(S)",totalHoras);
        } else if (hInicio < hFinal){
            int totalHoras = hFinal - hInicio;
            System.out.printf("O JOGO DUROU %d HORA(S)",totalHoras);
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)",24);
        }
    }
}
