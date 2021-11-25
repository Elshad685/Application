package classes;

import java.util.ArrayList;
import java.util.HashMap;

public class Decl {
    public  static  final String shvSocialDebtDivisionMssi="shvSocialDebtDivisionMssi";
    public  static  final String shvSocialDebtDivisionFines="shvSocialDebtDivisionFines";
    public  static  final String shvSocialDebtDivisionOther="shvSocialDebtDivisionOther";

    public  static  final String shvSocialDebtDivisionParamTaxcode="shvSocialDebtDivisionParamTaxcode";
    public  static  final String shvSocialDebtDivisionParamTaxtype="shvSocialDebtDivisionParamTaxtype";
    public  static  final String shvSocialDebtDivisionParamProperty="shvSocialDebtDivisionParamProperty";
    public  static  final String shvSocialDebtDivisionParamInsurancetypeid="shvSocialDebtDivisionParamInsurancetypeid";
    public  static  final String shvSocialDebtDivisionParamIncometype="shvSocialDebtDivisionParamIncometype";

    public static void main(String[] args) throws Exception {

        System.out.println(getSelectParamList(1));
       // System.out.println(getSelectParamList(-1));

    }
    public static String[][] debtParams = new String[][] {
            { "5000", "1", shvSocialDebtDivisionMssi, "1", "1" },	//chagne_field=1	idx=0
            { "5000", "6", shvSocialDebtDivisionMssi, "1", "6" }, 	//chagne_field=1	idx=1
            { "5000", "2", shvSocialDebtDivisionFines, "1", "" },	//chagne_field=2	idx=2
            { "5000", "5", shvSocialDebtDivisionOther, "1", "" }, 	//chagne_field=5	idx=3
            { "6000", "1", shvSocialDebtDivisionMssi, "2", "" },		//chagne_field=1	idx=4
            { "6000", "2", shvSocialDebtDivisionFines, "2", "" }, 	//chagne_field=2	idx=5
            { "6000", "5", shvSocialDebtDivisionOther, "2", "" }, 	//chagne_field=5	idx=6
            { "5000", "6", shvSocialDebtDivisionMssi, "1", "1" },	//chagne_field=1	idx=7
            { "5000", "1", shvSocialDebtDivisionMssi, "1", "6" },	//chagne_field=1	idx=8

            {"5000", "5", shvSocialDebtDivisionMssi, "1", "" },		//chagne_field=5	idx=9
            {"5000", "5", shvSocialDebtDivisionFines, "1", "" },		//chagne_field=5	idx=10
            {"5000", "2", shvSocialDebtDivisionMssi, "1", "" },		//chagne_field=2	idx=11
            {"5000", "2", shvSocialDebtDivisionOther, "1", "" },		//chagne_field=2	idx=12
            {"5000", "1", shvSocialDebtDivisionFines, "1", "" },		//chagne_field=1	idx=13 *
            {"5000", "1", shvSocialDebtDivisionOther, "1", "" },		//chagne_field=1	idx=14 *
            {"5000", "6", shvSocialDebtDivisionFines, "1", "" },		//chagne_field=1	idx=15 *
            {"5000", "6", shvSocialDebtDivisionOther, "1", "" },		//chagne_field=1	idx=16 *

            {"6000", "5", shvSocialDebtDivisionMssi, "2", "" },		//chagne_field=5	idx=17
            {"6000", "5", shvSocialDebtDivisionFines, "2", "" },		//chagne_field=5	idx=18
            {"6000", "2", shvSocialDebtDivisionMssi, "2", "" },		//chagne_field=2	idx=19
            {"6000", "2", shvSocialDebtDivisionOther, "2", "" },		//chagne_field=2	idx=20
            {"6000", "1", shvSocialDebtDivisionFines, "2", "" },		//chagne_field=1	idx=21
            {"6000", "1", shvSocialDebtDivisionOther, "2", "" },		//chagne_field=1	idx=22
    };

    public static ArrayList<HashMap<String, String>> getSelectParamList(int paramIndex) throws  Exception {
        ArrayList<HashMap<String, String>> debtParamList = new ArrayList<HashMap<String, String>>();
        if(paramIndex > debtParams.length-1) {
            throw new  Exception("param index: " + paramIndex +" not found in Division Params");
        }
        if(paramIndex > -1) {
            HashMap<String, String> param = new HashMap<String, String>();
            param.put(shvSocialDebtDivisionParamTaxcode, debtParams[paramIndex][0]);
            param.put(shvSocialDebtDivisionParamTaxtype, debtParams[paramIndex][1]);
            param.put(shvSocialDebtDivisionParamProperty, debtParams[paramIndex][2]);
            param.put(shvSocialDebtDivisionParamInsurancetypeid, debtParams[paramIndex][3]);
            param.put(shvSocialDebtDivisionParamIncometype, debtParams[paramIndex][4]);
            debtParamList.add(param);
        } else {
            for (String[] debtParam : debtParams) {
                HashMap<String, String> param = new HashMap<String, String>();
                param.put(shvSocialDebtDivisionParamTaxcode, debtParam[0]);
                param.put(shvSocialDebtDivisionParamTaxtype, debtParam[1]);
                param.put(shvSocialDebtDivisionParamProperty, debtParam[2]);
                param.put(shvSocialDebtDivisionParamInsurancetypeid, debtParam[3]);
                param.put(shvSocialDebtDivisionParamIncometype, debtParam[4]);
                debtParamList.add(param);
            }
        }

        return debtParamList;
    }
}
