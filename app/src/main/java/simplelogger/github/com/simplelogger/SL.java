package simplelogger.github.com.simplelogger;

import android.util.Log;

/**
 * Created by max on 22.08.15.
 */
public class SL {

    private static final String TAG = "SimpleLogger";

    public static void print(String text) {
        Log.i(TAG, text);
    }

}
