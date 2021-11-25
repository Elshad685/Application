package classes;

import java.util.Arrays;
import java.util.List;

public class _Stream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Elshad", "Sharbatov", "Tamerlan", "tamerlan","E");
        list.stream()
                .map(String::toUpperCase)
                .filter(x->x.startsWith("E"))
                .filter(x->x.length()>5)
                .forEach(System.out::println);


    }
}
