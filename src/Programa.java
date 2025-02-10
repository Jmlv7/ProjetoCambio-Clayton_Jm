import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do dólar?");
        double cotacao = sc.nextDouble();
        System.out.println("Quantos dólares serão comprados?");
        double quantidadeDolares = sc.nextDouble();

        double valorEmReais = CurrencyConverter.converter(cotacao, quantidadeDolares);

        System.out.printf("Valor a ser pago em reais = %.2f%n", valorEmReais);

        sc.close();
    }
}
