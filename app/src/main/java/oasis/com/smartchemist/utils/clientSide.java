package oasis.com.smartchemist.utils;

import android.content.Context;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.apache.http.entity.StringEntity;

public class clientSide {

    private static final String BASE_URL = "http://mysmartchemist.com/Smart_Chemist/Smart_ChemistRestService.svc/";
    //private static final String BASE_URL ="http://hajjlocator.com/HajiService/HajiRestService.svc/";
    //private static final String BASE_URL ="http://192.168.1.33:8082/HajiRestService.svc/";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void put(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.put(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(Context c, String url, StringEntity entity, String contentType, AsyncHttpResponseHandler responseHandler) {
        client.post(c, getAbsoluteUrl(url), entity, contentType, responseHandler);

    }



    public static void delete(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.delete(getAbsoluteUrl(url), responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }

}
