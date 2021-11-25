package impl;

import exception.MyException;
import interfaces.NewNecessaryMethods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import utility.Utility;

import java.math.BigDecimal;

@Data
@AllArgsConstructor

public class NewNecessaryMethodsImpl implements NewNecessaryMethods {

    @Override
    public String sum(double x, double y) throws MyException {
        double d = x + y;
        BigDecimal c = Utility.convertDoubleToBigDecimal(d);
        return c + "";
    }

    @Override
    public String emission(double x, double y) throws MyException {
        double d = x - y;
        BigDecimal c = Utility.convertDoubleToBigDecimal(d);
        return c + "";
    }

    @Override
    public String multiplication(double x, double y) throws MyException {
        double d = x * y;
        BigDecimal c = Utility.convertDoubleToBigDecimal(d);
        return c + "";
    }

    @Override
    public String division(double x, double y) throws MyException {
        double d;
        BigDecimal c = new BigDecimal("0");
        try {
            d = x / y;
            c = Utility.convertDoubleToBigDecimal(d);
        } catch (NumberFormatException e) {
            e.getMessage();
            return "0 bölmək olmaz";
        }
        return c + "";
    }


}
