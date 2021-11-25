package classes;

import java.math.BigDecimal;
import java.util.function.BiFunction;


import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

public class _TriFunction {
    public static void main(String[] args) {

        System.out.println("1");

    }

    public static TriFunction<BigDecimal, BigDecimal, BigDecimal, BigDecimal> f3 = (x, y, z) ->
            (x.add(y).add(z));

//    public static Consumer<BigDecimal> consumer = a -> a.compareTo(new BigDecimal("0")
//    ==1);

    @FunctionalInterface
    interface TriFunction<A, B, C, R> {

        R apply(A a, B b, C c);

        default <V> TriFunction<A, B, C, V> andThen(
                Function<? super R, ? extends V> after) {
            Objects.requireNonNull(after);
            return (A a, B b, C c) -> after.apply(apply(a, b, c));
        }
    }
}
