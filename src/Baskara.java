import java.util.Locale;
import java.util.Scanner;

public class Baskara {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os coeficientes a, b e c da equação ax^2 + bx + c = 0: ");

        System.out.print("Coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Coeficiente c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Esta equacao nao possui raizes reais");

        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("X1 = %.4f \n",raiz1);
            System.out.printf("X2 = %.4f ",raiz2);
        }

        scanner.close();
    }
}
