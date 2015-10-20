package oasis.com.smartchemist.databases;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import oasis.com.smartchemist.utils.Tax;


/**
 * Created by FDS on 15/10/2015.
 */
public class DatabaseTax extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "tax_details";
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_TABLE_TAX = "master_tax";
    private static final String TAX_CODE = "tax_code";
    public static final String TAX_NAME= "tax_name";
    public static final String TAX_PERCENTAGE= "tax_percentage";
    public static final String TAX_DESCRIPTION= "tax_description";
    public static final String ACTIVE= "active";


    public DatabaseTax(Context context) {
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create_table_tax="CREATE TABLE "+DATABASE_TABLE_TAX+"("+TAX_CODE+" TEXT PRIMARY KEY,"+TAX_NAME+" TEXT,"+TAX_PERCENTAGE+" TEXT,"+TAX_DESCRIPTION+" TEXT,"+ACTIVE+" TEXT)";
        sqLiteDatabase.execSQL(create_table_tax);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String drop_table_tax="DROP TABLE IF EXISTS "+DATABASE_TABLE_TAX;
        sqLiteDatabase.execSQL(drop_table_tax);
    }

    public void insertTaxDetails(Tax tax){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(TAX_CODE,tax.getTax_code());
        values.put(TAX_NAME,tax.getTax_name());
        values.put(TAX_PERCENTAGE,tax.getTax_percentage());
        values.put(TAX_DESCRIPTION,tax.getTax_desc());
        values.put(ACTIVE,tax.getActive());
        int i=db.update(DATABASE_TABLE_TAX,values,TAX_CODE+"=?",new String[]{TAX_CODE});
        if(i==0)
            db.insert(DATABASE_TABLE_TAX,null,values);
        db.close();
    }
}
