import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class PiNumber {
    public static String getNumber(int accuracy) {
        return "PI Number with accuracy " + accuracy + " is \n" + String.format("%." + accuracy + "f", piNumber(accuracy));
    }

    private static BigDecimal piNumber(int accuracy) {
        BigDecimal number = new BigDecimal(0);
        for (int i = 0; i <= accuracy; i++) {
            BigDecimal pow = BigDecimal.valueOf(Math.pow(-1, i));
            BigDecimal result = pow.divide(BigDecimal.valueOf(2L * i + 1), new MathContext(accuracy, RoundingMode.HALF_EVEN));
            number = number.add(result, new MathContext(accuracy, RoundingMode.HALF_EVEN));
        }
        return number.multiply(BigDecimal.valueOf(4), new MathContext(accuracy, RoundingMode.HALF_EVEN));
    }
}
