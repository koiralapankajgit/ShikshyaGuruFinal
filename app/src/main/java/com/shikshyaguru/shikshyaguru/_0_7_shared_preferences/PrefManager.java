package com.shikshyaguru.shikshyaguru._0_7_shared_preferences;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by cricpunk on 7/10/17.
 * Pankaj Koirala
 * Kathmandu Nepal
 */

public class PrefManager {

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    //private Context _context;

    // shared pref mode
    private static final int PRIVATE_MODE = 0;
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";
    private static final String IS_USER_LOGGED_IN = "isUserLoggedIn";

    public PrefManager(Context context, String preferenceName) {
        //this._context = context;
        pref = context.getSharedPreferences(preferenceName, PRIVATE_MODE);
        editor = pref.edit();
        editor.apply();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

    //Set user logged in status dynamically. This method will store users status into shared
    //preference
    public void setUserLoggedIn(boolean userLoggedIn) {
        editor.putBoolean(IS_USER_LOGGED_IN, userLoggedIn);
        editor.commit();
    }

    //By default set user logged in status true this method will used to check either user is
    // logged in or not.
    public boolean isUserLoggedIn() {
        return pref.getBoolean(IS_USER_LOGGED_IN, false);
    }

}