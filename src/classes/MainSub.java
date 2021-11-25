package classes;

import java.math.BigDecimal;
import java.util.function.*;

public class MainSub {
    public static void main(String[] args) {

        biFunction();
//        consumerExample();
//        biConsumerExample();
//        function();
//        unaryOperator();
    }

    public static void consumerExample() {
        Consumer<String> consumer = word -> {
            System.out.println(word); // Merhaba Dünya
        };

        consumer.accept("Merhaba Dünya");
    }

    public static void biConsumerExample() {

        BiConsumer<String, Integer> biConsumer = (name, age) -> {
            System.out.println(name + ":" + age); // Alinin yaşı:25
        };
        biConsumer.accept("Ali'nin yaşı", 25);
    }

    public static void function() {

        Function<Double, Double> function = t -> Math.pow(t, 2);
        Double result = function.apply(5.0);
        System.out.println("function" + result);
    }

    public static void biFunction() {

        BiFunction<Integer, Integer, BigDecimal> biFunction = (a, b) -> BigDecimal.valueOf((a + b));
        BigDecimal result = biFunction.apply(30, 20);
        System.out.println(result); // Sonuç: 8

    }

    public static void unaryOperator() {
        UnaryOperator<Double> unaryOperator = a -> Math.pow(a, 2);
        Double result = unaryOperator.apply(2.0);
        System.out.println("unaryOperator" + result);
    }
}
