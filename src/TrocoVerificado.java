import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double precoUnitario = scanner.nextDouble();

        System.out.print("Quantidade comprada: ");
        int qtdeComprada = scanner.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiro = scanner.nextDouble();

        double vlrPagar = qtdeComprada * precoUnitario;

        if (dinheiro < vlrPagar) {
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS",vlrPagar-dinheiro);
        } else {
            double troco = dinheiro - (qtdeComprada * precoUnitario);
            System.out.printf("TROCO: %.2f", troco);
        }
    }
}
