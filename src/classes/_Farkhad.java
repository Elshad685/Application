package classes;

import javax.swing.text.html.parser.Parser;
import java.math.BigDecimal;
import java.util.Scanner;

public class _Farkhad {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();

        String answer = answerWithString(s1, s2);


    }

    public static String answerWithString(String s1, String s2) throws Exception {
        if (!(s1.length() > 0 && s1.length() < 100) ||
                !(s2.length() > 0 && s2.length() < 100))
            throw new Exception("Ədədlərin uzunluğu  0 və 100 arası olmalıdır");
        else {
            BigDecimal s1b = new BigDecimal(s1);
            BigDecimal s2b = new BigDecimal(s2);
            BigDecimal s = s1b.multiply(s2b);
            String ss = s.toString();
            return ss;
        }
    }


}
