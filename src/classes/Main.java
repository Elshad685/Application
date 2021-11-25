package classes;

import entity.Stock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Main {
    private static String shvSocialDebtDivisionMssi = "shvSocialDebtDivisionMssi";
    private static String shvSocialDebtDivisionFines = "shvSocialDebtDivisionFines";
    private static String shvSocialDebtDivisionOther = "shvSocialDebtDivisionOther";

    public static void main(String[] args) throws Exception {

        Predicate<String> dIleMiBasliyor = (x)->x.startsWith("d");
        Predicate<String> nIleMiBitiyor = (x)->x.endsWith("n");
        Predicate<String> dileBaslayipNIleBiten = dIleMiBasliyor.and(nIleMiBitiyor);
        System.out.println(dileBaslayipNIleBiten.test("Elshad"));

        /*
        for (int i = 0; i < debtParams.length; i++) {
            for (int j = 0; j < debtParams[i].length; j++) {
             //   System.out.print((debtParams[i][j]));
            }
        }

         */
    }

    public static String[][] debtParams = new String[][]{
            {"5000", "1", shvSocialDebtDivisionMssi, "1", "1"}
            /*,    //chagne_field=1	idx=0
            {"5000", "6", shvSocialDebtDivisionMssi, "1", "6"},    //chagne_field=1	idx=1
            {"5000", "2", shvSocialDebtDivisionFines, "1", ""},    //chagne_field=2	idx=2
            {"5000", "5", shvSocialDebtDivisionOther, "1", ""},    //chagne_field=5	idx=3
            {"6000", "1", shvSocialDebtDivisionMssi, "2", ""},        //chagne_field=1	idx=4
            {"6000", "2", shvSocialDebtDivisionFines, "2", ""},    //chagne_field=2	idx=5
            {"6000", "5", shvSocialDebtDivisionOther, "2", ""},    //chagne_field=5	idx=6
            {"5000", "6", shvSocialDebtDivisionMssi, "1", "1"},    //chagne_field=1	idx=7
            {"5000", "1", shvSocialDebtDivisionMssi, "1", "6"},    //chagne_field=1	idx=8

            {"5000", "5", shvSocialDebtDivisionMssi, "1", ""},        //chagne_field=5	idx=9
            {"5000", "5", shvSocialDebtDivisionFines, "1", ""},        //chagne_field=5	idx=10
            {"5000", "2", shvSocialDebtDivisionMssi, "1", ""},        //chagne_field=2	idx=11
            {"5000", "2", shvSocialDebtDivisionOther, "1", ""},        //chagne_field=2	idx=12
            {"5000", "1", shvSocialDebtDivisionFines, "1", ""},        //chagne_field=1	idx=13 *
            {"5000", "1", shvSocialDebtDivisionOther, "1", ""},        //chagne_field=1	idx=14 *
            {"5000", "6", shvSocialDebtDivisionFines, "1", ""},        //chagne_field=1	idx=15 *
            {"5000", "6", shvSocialDebtDivisionOther, "1", ""},        //chagne_field=1	idx=16 *

            {"6000", "5", shvSocialDebtDivisionMssi, "2", ""},        //chagne_field=5	idx=17
            {"6000", "5", shvSocialDebtDivisionFines, "2", ""},        //chagne_field=5	idx=18
            {"6000", "2", shvSocialDebtDivisionMssi, "2", ""},        //chagne_field=2	idx=19
            {"6000", "2", shvSocialDebtDivisionOther, "2", ""},        //chagne_field=2	idx=20
            {"6000", "1", shvSocialDebtDivisionFines, "2", ""},        //chagne_field=1	idx=21
            {"6000", "1", shvSocialDebtDivisionOther, "2", ""},        //chagne_field=1	idx=22

             */
    };


}

