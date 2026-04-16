import java.math.BigDecimal;

public class VariablenUndDatentypen {
    public static void main(String[] args) {
        long ergebnis = 1000000L * 1000000L;
       // System.out.println(ergebnis);
       // System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 - 1.0);

        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < 10; i++) {
            sum = sum.add(new BigDecimal("0.1"));
        }
        System.out.println(sum.subtract(BigDecimal.ONE)); // Ausgabe: 0.0
        int min = 10;
        int max = 20;
        int between = 12;
        boolean isBetween = between > min && between < max;
        System.out.println(isBetween);
    }
}
