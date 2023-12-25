import java.util.Locale;
import java.util.Scanner;

public class Glicose {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        double medida = scanner.nextDouble();

        if (medida <= 100.0) {
            System.out.printf("Classificacao: normal");
        } else if(medida >= 100.0 && medida <= 140.0) {
            System.out.printf("Classificacao: elevado");
        } else {
            System.out.printf("Classificacao: diabetes");
        }
    }
}
