package classes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Optional;
import java.util.function.Function;

public class AmountType {
    public static void main(String[] args) {

        System.out.println(biFunction(new BigDecimal("0"), Division.millionAZN));
        System.out.println(divideAndRound(new BigDecimal("0"), Division.millionAZN));
    }

    public static BigDecimal biFunction(BigDecimal number, Division division) {
        Function<BigDecimal, BigDecimal> function = bigDecimal -> bigDecimal
                .divide(new BigDecimal(division.getDivideParam()))
                .setScale(division.getRoundParam(), RoundingMode.HALF_UP);
        BigDecimal result = function.apply(number);
        return result;
    }

    public static BigDecimal divideAndRound(BigDecimal number, Division amountType) {
        if (number == null) number = BigDecimal.ZERO;
        int roundParam = amountType.getRoundParam();
        int divideParam = amountType.getDivideParam();
        number = number.divide(new BigDecimal(divideParam));
        number = number.setScale(roundParam, RoundingMode.HALF_UP);
        return number;
    }


    public static BigDecimal eXec(BigDecimal number, Division division) {


        return null;
    }
}