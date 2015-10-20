package oasis.com.smartchemist.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Amit on 16-May-15.
 */
public class CheckNetwork {
    public static int TYPE_WIFI = 1;
    public static int TYPE_MOBILE = 2;
    public static int TYPE_NOT_CONNECTED = 0;


    private static int getConnectivityStatus(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (null != activeNetwork) {
            if(activeNetwork.getType() == ConnectivityManager.TYPE_WIFI)
                return TYPE_WIFI;

            if(activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE)
                return TYPE_MOBILE;
        }
        return TYPE_NOT_CONNECTED;
    }

    public static boolean getConnectivityStatusString(Context context) {
        int conn = CheckNetwork.getConnectivityStatus(context);
        boolean status = false;
        if (conn == CheckNetwork.TYPE_WIFI) {
            status = true;
        } else if (conn == CheckNetwork.TYPE_MOBILE) {
            status =true;
        } else if (conn == CheckNetwork.TYPE_NOT_CONNECTED) {
            status = false;
        }
        return status;
    }
}
