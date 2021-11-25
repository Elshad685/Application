package classes;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Signature {
    public static void main(String[] args) {

        List<File> ls = new ArrayList<>();
        ls.add(new File("k:\\vpn login pass .txt"));
        ls.add(new File("d:\\vpn login pass .txt"));
        File file = new File("c:\\vpn login pass .txt");

        System.out.println(sign(ls, file, "a"));

    }

    public static File sign(List<File> batchToSign, File dir, String pin) {
        List<File> list = new ArrayList<>();
        File file = null;
        for (int i = 0; i < batchToSign.size(); i++) {
            file = new File(String.valueOf(dir));
        }
        return file;
    }
}
