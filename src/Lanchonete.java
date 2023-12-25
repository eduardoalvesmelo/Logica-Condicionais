import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo do produto comprado: ");
        int cod = sc.nextInt();

        System.out.print("Quantidade comprada: ");
        int qtd = sc.nextInt();

        if (cod == 1) {
            double vlr = 5.00 * qtd;
            System.out.printf("Valor a pagar: R$ %.2f",vlr);
        } else if (cod == 2) {
            double vlr = 3.50 * qtd;
            System.out.printf("Valor a pagar: R$ %.2f",vlr);
        } else if (cod == 3) {
            double vlr = 4.80 * qtd;
            System.out.printf("Valor a pagar: R$ %.2f",vlr);
        } else if (cod == 4) {
            double vlr = 8.90 * qtd;
            System.out.printf("Valor a pagar: R$ %.2f",vlr);
        } else if (cod == 5) {
            double vlr = 7.32 * qtd;
            System.out.printf("Valor a pagar: R$ %.2f",vlr);
        }
    }
}
