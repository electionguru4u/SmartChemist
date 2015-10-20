package oasis.com.smartchemist.databases;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import oasis.com.smartchemist.utils.Wholesaler;


/**
 * Created by FDS on 15/10/2015.
 */
public class DatabaseWholesaler extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "master_wholesaler";
    private static final String DATABASE_TABLE_WHOLESALER = "wholesaler";
    private static final int DATABASE_VERSION = 1;

    private static final String WHOLESALER_ID = "_id";
    public static final String WHOLESALER_CODE = "wholesaler_code";
    private static final String WHOLESALER_ONE_ALL_CODE = "wholesaler_one_all_code";
    public static final String WHOLESALER_NAME = "wholesaler_name";
    private static final String WHOLESALER_ADDRESS = "wholesaler_address";
    private static final String WHOLESALER_CITY = "wholesaler_city";
    private static final String WHOLESALER_LANDLINE_NO = "wholesaler_landline_no";
    private static final String WHOLESALER_MOBILE_NO = "wholesaler_mobile_no";
    private static final String WHOLESALER_EMAIL_ID = "wholesaler_email_id";
    private static final String WHOLESALER_DESCRIPTION = "wholesaler_description";
    private static final String WHOLESALER_VALIDITY = "wholesaler_validity";
    private static final String PRODUCT_LAST_UPDATED = "product_last_updated";
    private static final String STOCK_LAST_UPDATED = "stock_last_updated";

    private static final String WHOLESALER_ACTIVE = "active";

    public DatabaseWholesaler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create_table_wholesaler = "CREATE TABLE " + DATABASE_TABLE_WHOLESALER + "(" + WHOLESALER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + WHOLESALER_CODE + " TEXT," + WHOLESALER_ONE_ALL_CODE + " TEXT," + WHOLESALER_NAME + " TEXT," + WHOLESALER_ADDRESS + " TEXT," + WHOLESALER_CITY + " TEXT," + WHOLESALER_LANDLINE_NO + " TEXT," + WHOLESALER_MOBILE_NO + " TEXT," + WHOLESALER_EMAIL_ID + " TEXT," + WHOLESALER_DESCRIPTION + " TEXT," + WHOLESALER_VALIDITY + " TEXT," + WHOLESALER_ACTIVE + " TEXT," + PRODUCT_LAST_UPDATED + " TEXT," + STOCK_LAST_UPDATED + " TEXT)";
        sqLiteDatabase.execSQL(create_table_wholesaler);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String drop_table_wholesaler = "DROP TABLE IF EXISTS " + DATABASE_TABLE_WHOLESALER;
        sqLiteDatabase.execSQL(drop_table_wholesaler);
    }

    public void insertWholesalerDetails(Wholesaler wholesaler) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(WHOLESALER_CODE, wholesaler.getCode());
        values.put(WHOLESALER_ONE_ALL_CODE, wholesaler.getOne_all_code());
        values.put(WHOLESALER_NAME, wholesaler.getName());
        values.put(WHOLESALER_ADDRESS, wholesaler.getAddress());
        values.put(WHOLESALER_CITY, wholesaler.getCity());
        values.put(WHOLESALER_LANDLINE_NO, wholesaler.getLandline_no());
        values.put(WHOLESALER_MOBILE_NO, wholesaler.getMobile_no());
        values.put(WHOLESALER_EMAIL_ID, wholesaler.getEmail_id());
        values.put(WHOLESALER_DESCRIPTION, wholesaler.getDescription());
        values.put(WHOLESALER_VALIDITY, wholesaler.getValidity());
        values.put(WHOLESALER_ACTIVE, wholesaler.getActive());
        values.put(PRODUCT_LAST_UPDATED, wholesaler.getProducts_last_updated());
        values.put(STOCK_LAST_UPDATED, wholesaler.getStock_last_udated());
        int i = db.update(DATABASE_TABLE_WHOLESALER, values, WHOLESALER_CODE + "=?", new String[]{wholesaler.getCode()});
        if (i == 0)
            db.insert(DATABASE_TABLE_WHOLESALER, null, values);
        db.close();
    }

    public void setProductLastUpdated(String dateTime) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(PRODUCT_LAST_UPDATED, dateTime);
        db.update(DATABASE_TABLE_WHOLESALER, values, null, null);
        db.close();
    }

    public void setStockLastUpdated(String dateTime) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(STOCK_LAST_UPDATED, dateTime);
        db.update(DATABASE_TABLE_WHOLESALER, values, null, null);
        db.close();
    }


    public void updateActiveStatus(String status) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(WHOLESALER_ACTIVE, status);
        db.update(DATABASE_TABLE_WHOLESALER, values, null, null);
        db.close();
    }

    public void updateWholesalerValidity(String date) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(WHOLESALER_VALIDITY, date);
        db.update(DATABASE_TABLE_WHOLESALER, values, null, null);
        db.close();
        updateActiveStatus("1");
    }

    public String getWholesalerCode() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(DATABASE_TABLE_WHOLESALER, new String[]{WHOLESALER_CODE}, null, null, null, null, null);
        if (cursor.getCount() != 0) {
            cursor.moveToFirst();
            String name = cursor.getString(cursor.getColumnIndex(WHOLESALER_CODE));
            cursor.close();
            return name;
        }
        cursor.close();
        return "";
    }

    public Wholesaler getWhoslaerDetails(String wholesaler_code) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(DATABASE_TABLE_WHOLESALER, null, null, null, null, null, null);
        if (cursor.getCount() != 0) {
            cursor.moveToFirst();

            String code = cursor.getString(cursor.getColumnIndex(WHOLESALER_CODE));
            String one_all_code = cursor.getString(cursor.getColumnIndex(WHOLESALER_ONE_ALL_CODE));
            String name = cursor.getString(cursor.getColumnIndex(WHOLESALER_NAME));
            String address = cursor.getString(cursor.getColumnIndex(WHOLESALER_ADDRESS));
            String city = cursor.getString(cursor.getColumnIndex(WHOLESALER_CITY));
            String landline = cursor.getString(cursor.getColumnIndex(WHOLESALER_LANDLINE_NO));
            String mobile = cursor.getString(cursor.getColumnIndex(WHOLESALER_MOBILE_NO));
            String email = cursor.getString(cursor.getColumnIndex(WHOLESALER_EMAIL_ID));
            String desc = cursor.getString(cursor.getColumnIndex(WHOLESALER_DESCRIPTION));
            String validity = cursor.getString(cursor.getColumnIndex(WHOLESALER_VALIDITY));
            String active = cursor.getString(cursor.getColumnIndex(WHOLESALER_ACTIVE));
            String plu = cursor.getString(cursor.getColumnIndex(PRODUCT_LAST_UPDATED));
            String slu = cursor.getString(cursor.getColumnIndex(STOCK_LAST_UPDATED));
            cursor.close();
            db.close();
            return new Wholesaler(code, one_all_code, name, address, city, landline, mobile, email, desc, validity, active, plu, slu);
        }
        cursor.close();
        db.close();
        return null;
    }

}
