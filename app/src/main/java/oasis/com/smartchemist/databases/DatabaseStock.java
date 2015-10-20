package oasis.com.smartchemist.databases;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import oasis.com.smartchemist.utils.Rack;
import oasis.com.smartchemist.utils.Shelf;
import oasis.com.smartchemist.utils.Tax;


public class DatabaseStock extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "stocks_db";
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_MASTER_RACK = "master_rack";
    private static final String RACK_CODE = "mrk_code";
    private static final String RACK_NAME = "mrk_rack_name";
    private static final String RACK_DESCRIPTION = "mrk_description";

    private static final String DATABASE_MASTER_SHELF = "master_shelf";
    private static final String SHELF_CODE = "msf_code";
    private static final String SHELF_NAME = "msf_shelf_name";
    private static final String SHELF_DESCRIPTION = "msf_description";

    private static final String DATABASE_MASTER_BATCH = "master_batch";
    private static final String BATCH_CODE = "BATCH_code";
    private static final String PRODUCT_CODE = "mpd_code";
    private static final String BATCH_BATCH_NO = "BATCH_batch_no";
    private static final String BATCH_MFG_DATE = "BATCH_mfg_date";
    private static final String BATCH_EXPIRY_DATE = "BATCH_expiry_date";
    private static final String BATCH_MRP = "BATCH_mrp";

    private static final String DATABASE_MASTER_STOCK = "master_stock";
    private static final String STOCK_CODE = "mst_code";
    private static final String TAX_CODE = "mst_code";
    private static final String STOCK_QUANTITY = "mst_quantity";
//stock_code,batch_code,tax_code,quantity,shelf_code;
    private static final String DATABASE_TABLE_TAX = "master_tax";
    public static final String TAX_NAME= "tax_name";
    public static final String TAX_PERCENTAGE= "tax_percentage";
    public static final String TAX_DESCRIPTION= "tax_description";
    public static final String ACTIVE= "active";

    public DatabaseStock(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create_table_master_rack = "CREATE TABLE " + DATABASE_MASTER_RACK + "(" + RACK_CODE + " TEXT PRIMARY KEY," + RACK_NAME + " TEXT," + RACK_DESCRIPTION + " TEXT)";
        String create_table_master_shelf = "CREATE TABLE " + DATABASE_MASTER_SHELF + "(" + SHELF_CODE + " TEXT PRIMARY KEY," + RACK_CODE + " TEXT," + SHELF_NAME + " TEXT," + SHELF_DESCRIPTION + " TEXT)";
        String create_table_master_batch = "CREATE TABLE " + DATABASE_MASTER_BATCH + "(" + BATCH_CODE + " TEXT PRIMARY KEY," + PRODUCT_CODE + " TEXT," + BATCH_BATCH_NO + " TEXT," + BATCH_MFG_DATE + " TEXT," + BATCH_EXPIRY_DATE + " TEXT," + BATCH_MRP + " TEXT)";
        String create_table_master_stock = "CREATE TABLE " + DATABASE_MASTER_STOCK + "(" + STOCK_CODE + " TEXT PRIMARY KEY," + BATCH_CODE + " TEXT," + TAX_CODE+" TEXT,"+STOCK_QUANTITY + " TEXT,"+SHELF_CODE+" TEXT)";
        String create_table_tax="CREATE TABLE "+DATABASE_TABLE_TAX+"("+TAX_CODE+" TEXT PRIMARY KEY,"+TAX_NAME+" TEXT,"+TAX_PERCENTAGE+" TEXT,"+TAX_DESCRIPTION+" TEXT,"+ACTIVE+" TEXT)";

        sqLiteDatabase.execSQL(create_table_master_rack);
        sqLiteDatabase.execSQL(create_table_master_shelf);
        sqLiteDatabase.execSQL(create_table_master_batch);
        sqLiteDatabase.execSQL(create_table_master_stock);
        sqLiteDatabase.execSQL(create_table_tax);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String drop_table_master_rack = "DROP TABLE IF EXISTS " + DATABASE_MASTER_RACK;
        String drop_table_master_shelf = "DROP TABLE IF EXISTS " + DATABASE_MASTER_SHELF;
        String drop_table_master_batch = "DROP TABLE IF EXISTS " + DATABASE_MASTER_BATCH;
        String drop_table_master_stock = "DROP TABLE IF EXISTS " + DATABASE_MASTER_STOCK;
        String drop_table_tax="DROP TABLE IF EXISTS "+DATABASE_TABLE_TAX;

        sqLiteDatabase.execSQL(drop_table_master_rack);
        sqLiteDatabase.execSQL(drop_table_master_shelf);
        sqLiteDatabase.execSQL(drop_table_master_batch);
        sqLiteDatabase.execSQL(drop_table_master_stock);
        sqLiteDatabase.execSQL(drop_table_tax);
    }

    public void insertRackDetails(Rack rack) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(RACK_CODE, rack.getMrk_code());
        values.put(RACK_NAME, rack.getMrk_rack_name());
        values.put(RACK_DESCRIPTION, rack.getMrk_desc());
        int i = db.update(DATABASE_MASTER_RACK, values, RACK_CODE + "=?", new String[]{rack.getMrk_code()});
        if (i == 0)
            db.insert(DATABASE_MASTER_RACK, null, values);
        db.close();
    }

    public void insertShelfDetails(Shelf shelf) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(SHELF_CODE, shelf.getMsf_code());
        values.put(RACK_CODE, shelf.getMrk_code());
        values.put(SHELF_NAME, shelf.getMsf_shelf_name());
        values.put(SHELF_DESCRIPTION, shelf.getMsf_desc());
        int i = db.update(DATABASE_MASTER_SHELF, values, SHELF_CODE + "=?", new String[]{shelf.getMsf_code()});
        if (i == 0)
            db.insert(DATABASE_MASTER_SHELF, null, values);
        db.close();
    }

   /* public void insertBatchDetails(Batch batch) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(BATCH_CODE, batch.getBATCH_code());
        values.put(PRODUCT_CODE, batch.getMpd_code());
        values.put(BATCH_BATCH_NO, batch.getBATCH_batch_no());
        values.put(BATCH_MFG_DATE, batch.getBATCH_mfg_date());
        values.put(BATCH_EXPIRY_DATE, batch.getBATCH_expiry_date());
        values.put(BATCH_MRP, batch.getBATCH_mrp());
        int i = db.update(DATABASE_MASTER_BATCH, values, BATCH_CODE + "=?", new String[]{batch.getBATCH_code()});
        if (i == 0)
            db.insert(DATABASE_MASTER_BATCH, null, values);
        db.close();
    }

    public void insertStockDetails(Stock stock) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(MST_CODE, stock.getMst_code());
        values.put(BATCH_CODE,stock.getBATCH_code());
        values.put(MST_QUANTITY, stock.getMst_quantity());
        int i = db.update(DATABASE_MASTER_STOCK, values, MST_CODE+ "=?", new String[]{stock.getMst_code()});
        if (i == 0)
            db.insert(DATABASE_MASTER_STOCK, null, values);
        db.close();
    }*/
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
