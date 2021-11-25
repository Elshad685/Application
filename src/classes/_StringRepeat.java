package classes;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
class EClass {
    private String id;
    private String name;
    private String surname;
    private String fin;

}

public class _StringRepeat {
    public static void main(String[] args) throws Exception {

        List<EClass> list = new ArrayList<EClass>();

        list.add(new EClass("1", "Elshad", "Sharbatov", "0A"));
        list.add(new EClass("2", "Elshad", "Sharbatov", "2A"));
        list.add(new EClass("3", "Tamerlan", "Sharbatov", "3A"));


        List<String> ssn = list.stream()
                .map(EClass::getId).collect(Collectors.groupingBy(Function.identity()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        List<String> pin = list.stream()
                .map(EClass::getFin).collect(Collectors.groupingBy(Function.identity()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        if (ssn.size() > 0 || pin.size() > 0)
            throw new Exception("One time");

    }
}
