import java.util.Locale;
import java.util.Scanner;

public class menorDeTres {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int menor = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int v1 = scanner.nextInt();

        System.out.print("Segundo valor: ");
        int v2 = scanner.nextInt();

        System.out.print("Terceiro valor: ");
        int v3 = scanner.nextInt();

        if(v1 < v2 && v1 < v3) {
            System.out.printf("MENOR = %d", v1);
        }
        else if (v2 < v3 && v2 < v1) {
            System.out.printf("MENOR = %d", v2);
        }
        else {
            System.out.printf("MENOR = %d", v3);
        }

    }
}
