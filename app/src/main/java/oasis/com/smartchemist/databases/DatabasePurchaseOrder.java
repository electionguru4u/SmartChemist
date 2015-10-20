package oasis.com.smartchemist.databases;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabasePurchaseOrder extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "master_purchase";
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_MASTER_PURCHASE_ORDER = "purchase_order";
    private static final String KEY_ID = "_ID";
    private static final String PO_CODE = "po_code";


    private static final String DATABASE_DETAIL_PURCHASE_ORDER = "detail_purchase_order";

    public DatabasePurchaseOrder(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }

}
