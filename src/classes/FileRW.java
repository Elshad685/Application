package classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FileRW {


    public static void main(String[] args) throws IOException {
        List<RW> list = List.of(
                new RW(1L, "Elshad", "Sharbatov", Gender.MALE),
                new RW(2L, "Elshan", "Sharbatov", Gender.MALE),
                new RW(3L, "Tamerlan", "Sharbatov", Gender.MALE));


    }
}
