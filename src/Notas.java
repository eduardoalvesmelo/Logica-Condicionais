import java.util.Locale;
import java.util.Scanner;

public class Notas {
    private double nota1;
    private double nota2;

    public Notas(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNotaFinal() {
        return nota1 + nota2;
    }

    public String getMsg(){

        if (getNotaFinal() < 60.0) {
            return "REPROVADO";
        }
        return "";
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        Notas notas = new Notas(n1,n2);
        System.out.printf("NOTA FINAL = %.1f\n",notas.getNotaFinal());
        System.out.printf("%s",notas.getMsg());
    }
}
