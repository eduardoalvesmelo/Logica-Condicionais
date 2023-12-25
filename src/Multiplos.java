import java.util.Locale;
import java.util.Scanner;

public class Multiplos {

    static boolean getMultiplos(int num1, int num2) {
        return num1 % num2 == 0 || num2 % num1 == 0;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros: ");
        int n1 = sc.nextInt();
        System.out.print("");
        int n2 = sc.nextInt();

        if (getMultiplos(n1, n2)) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }

        sc.close();
    }
}
