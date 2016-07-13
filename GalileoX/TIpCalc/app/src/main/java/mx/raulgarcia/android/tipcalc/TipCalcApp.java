package mx.raulgarcia.android.tipcalc;

import android.app.Application;

/**
 * Created by rraulg5 on 13/07/2016.
 */
public class TipCalcApp extends Application {

    private final static String ABOUT_URL = "http://raulgarcia.mx/";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
