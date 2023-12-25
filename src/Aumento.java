import java.util.Locale;
import java.util.Scanner;

public class Aumento {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        double sal = sc.nextDouble();

        if (sal <= 1000.0) {
            double novoSal = sal * 1.2;
            double aumento = novoSal - sal;
            double perc = (novoSal - sal)/sal*100;
            System.out.printf("Novo salario = R$ %.2f\n",novoSal);
            System.out.printf("Aumento = R$ %.2f\n", aumento);
            System.out.printf("Porcentagem = %.0f %%", perc);
        } else if (sal > 1000.0 && sal <= 3000.0) {
            double novoSal = sal * 1.15;
            double aumento = novoSal - sal;
            double perc = (novoSal - sal)/sal*100;
            System.out.printf("Novo salario = R$ %.2f\n",novoSal);
            System.out.printf("Aumento = R$ %.2f\n", aumento);
            System.out.printf("Porcentagem = %.0f %%", perc);
        } else if (sal > 3000.0 && sal <= 8000.0) {
            double novoSal = sal * 1.1;
            double aumento = novoSal - sal;
            double perc = (novoSal - sal)/sal*100;
            System.out.printf("Novo salario = R$ %.2f\n",novoSal);
            System.out.printf("Aumento = R$ %.2f\n", aumento);
            System.out.printf("Porcentagem = %.0f %%", perc);
        } else {
            double novoSal = sal * 1.05;
            double aumento = novoSal - sal;
            double perc = (novoSal - sal)/sal*100;
            System.out.printf("Novo salario = R$ %.2f\n",novoSal);
            System.out.printf("Aumento = R$ %.2f\n", aumento);
            System.out.printf("Porcentagem = %.0f %%", perc);
        }
    }
}
