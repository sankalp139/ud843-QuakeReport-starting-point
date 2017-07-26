package com.example.android.quakereport;

/**
 * Created by Sankalp on 7/16/2017.
 */

public class word  {
private String mag;
    private String place;
    private String date;
    public word(String m,String p, String d) {
        mag=m;
        place=p;
        date=d;
    }


    public String  getmag(){return mag;}
    public String getplace() {
        return place;
    }
    public String getdate() {
        return date;
    }

}
