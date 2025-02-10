public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double converter(double cotacao, double quantidadeDolares) {
        return quantidadeDolares * cotacao * (1 + IOF);
    }
}
