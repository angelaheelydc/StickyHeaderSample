package com.networks.testapplication;

import java.util.TimeZone;

public class AppPreferencesHelper {

    private static AppPreferencesHelper mAppPreferencesHelper = null;
    public static AppPreferencesHelper getInstance(){
        if(mAppPreferencesHelper == null){
            mAppPreferencesHelper = new AppPreferencesHelper();
        }
        return mAppPreferencesHelper;
    }

    public String getDefaultTimeZone(){
        return "EST";
    }

    public int getVisitorRegistrationLeadTime(){
        return 0;
    }
}
