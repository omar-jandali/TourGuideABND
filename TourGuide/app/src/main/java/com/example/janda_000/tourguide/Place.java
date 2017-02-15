package com.example.janda_000.tourguide;

/**
 * Created by janda_000 on 2/15/2017.
 */

public class Place {

    private String tgName;
    private String tgAddress;
    private String tgPhone;

    public Place(String name, String address, String phone){

        tgName = name;
        tgAddress = address;
        tgPhone = phone;

    }

    public String getTgName(){ return tgName; }
    public String getTgAddress(){ return tgAddress; }
    public String getTgPhone(){ return tgPhone; }

    @Override
    public String toString() {
        return "Place{" +
                "tgName='" + tgName + '\'' +
                "tgAddress='" + tgAddress + '\'' +
                "tgPhone='" + tgPhone + '\'' + "}";
    }
}
