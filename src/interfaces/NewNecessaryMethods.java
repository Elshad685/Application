package interfaces;

import exception.MyException;

import java.math.BigDecimal;

public interface NewNecessaryMethods {

    String sum(double x, double y) throws MyException;

    String emission(double x, double y) throws MyException;

    String multiplication(double x, double y) throws MyException;

    String division(double x, double y) throws MyException;
}
