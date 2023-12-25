import java.util.Locale;
import java.util.Scanner;

public class temperatura {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char c = sc.next().charAt(0);

        if (c == 'F'){
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahr = sc.nextDouble();
            double celsius = (fahr - 32) * 5/9;
            System.out.printf("Temperatura equivalente em Celsius: %.2f", celsius);
        } else if (c == 'C'){
            System.out.print("Digite a temperatura em Celsius: ");
            double cels = sc.nextDouble();
            double fahr = (cels * 9/5) + 32;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", fahr);
        } else {
            System.out.printf("Opção não é válida");
        }
    }
}
