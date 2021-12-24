package chamorro.edisson.utilities;

public class SplitDate {

    public static String getMonth(String date){
        String []dat=date.split("/");
        return dat[1];
    }
    public static String getYear(String date){
        String []dat=date.split("/");
        return dat[2];
    }
    public static String getDay(String date){
        String []dat=date.split("/");
        return dat[0];
    }
}
